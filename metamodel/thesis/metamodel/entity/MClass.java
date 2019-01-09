package thesis.metamodel.entity;

public interface MClass extends ro.lrg.xcore.metametamodel.XEntity {

	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.String toString();

	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.Double avgNoOfArgumentsInMethods();

	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MMethod> methodGroup();

	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MTypeParameter> allTypeParameters();

	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MTypePair> allTypeParameterPairs();

	@ro.lrg.xcore.metametamodel.ThisIsAnAction(numParams = 0) 
	public void showInEditor ();

	org.eclipse.jdt.core.IType getUnderlyingObject();
}