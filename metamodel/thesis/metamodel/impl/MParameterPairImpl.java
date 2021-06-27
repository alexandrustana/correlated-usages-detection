package thesis.metamodel.impl;

import thesis.metamodel.entity.*;
import upt.se.parameters.pair.ToString;
import upt.se.parameters.pair.ApertureCoverage;
import upt.se.parameters.pair.UsedArgumentsTypes;
import upt.se.parameters.pair.UnusedArgumentsTypes;
import upt.se.parameters.pair.AllPossibleArgumentsTypes;

public class MParameterPairImpl implements MParameterPair {

	private upt.se.utils.ParameterPair underlyingObj_;

	private static final ToString ToString_INSTANCE = new ToString();
	private static final ApertureCoverage ApertureCoverage_INSTANCE = new ApertureCoverage();
	private static final UsedArgumentsTypes UsedArgumentsTypes_INSTANCE = new UsedArgumentsTypes();
	private static final UnusedArgumentsTypes UnusedArgumentsTypes_INSTANCE = new UnusedArgumentsTypes();
	private static final AllPossibleArgumentsTypes AllPossibleArgumentsTypes_INSTANCE = new AllPossibleArgumentsTypes();

	public MParameterPairImpl(upt.se.utils.ParameterPair underlyingObj) {
		underlyingObj_ = underlyingObj;
	}

	@Override
	public upt.se.utils.ParameterPair getUnderlyingObject() {
		return underlyingObj_;
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.String toString() {
		return ToString_INSTANCE.compute(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsAProperty
	public java.lang.Double apertureCoverage() {
		return ApertureCoverage_INSTANCE.compute(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> usedArgumentsTypes() {
		return UsedArgumentsTypes_INSTANCE.buildGroup(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> unusedArgumentsTypes() {
		return UnusedArgumentsTypes_INSTANCE.buildGroup(this);
	}

	@Override
	@ro.lrg.xcore.metametamodel.ThisIsARelationBuilder
	public ro.lrg.xcore.metametamodel.Group<MClassPair> allPossibleArgumentsTypes() {
		return AllPossibleArgumentsTypes_INSTANCE.buildGroup(this);
	}

	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof MParameterPairImpl)) {
			return false;
		}
		MParameterPairImpl iObj = (MParameterPairImpl)obj;
		return underlyingObj_.equals(iObj.underlyingObj_);
	}

	public int hashCode() {
		return 97 * underlyingObj_.hashCode();
	}
}
