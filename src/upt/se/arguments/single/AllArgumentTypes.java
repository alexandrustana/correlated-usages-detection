package upt.se.arguments.single;

import static io.vavr.API.For;
import static upt.se.arguments.single.helper.AllArgumentTypesHelper.*;
import static upt.se.utils.helpers.ClassNames.*;
import java.util.Collections;
import io.vavr.collection.List;
import io.vavr.control.Try;
import ro.lrg.xcore.metametamodel.Group;
import ro.lrg.xcore.metametamodel.IRelationBuilder;
import ro.lrg.xcore.metametamodel.RelationBuilder;
import thesis.metamodel.entity.MArgumentType;
import thesis.metamodel.factory.Factory;
import upt.se.utils.builders.GroupBuilder;

@RelationBuilder
public class AllArgumentTypes implements IRelationBuilder<MArgumentType, MArgumentType> {

  @Override
  public Group<MArgumentType> buildGroup(MArgumentType entity) {
    return Try.of(() -> entity.getUnderlyingObject())
        .flatMap(type -> For(classArgumentTypes(type), interfaceArgumentTypes(type))
            .yield((classArguments,
                interfaceArguments) -> isObject(classArguments.head())
                    && !interfaceArguments.isEmpty()
                        ? interfaceArguments
                        : classArguments.appendAll(interfaceArguments)))
        .map(types -> types.map(Factory.getInstance()::createMArgumentType))
        .map(List::toJavaList)
        .orElse(() -> Try.success(Collections.emptyList()))
        .map(GroupBuilder::wrap)
        .get();
  }

}