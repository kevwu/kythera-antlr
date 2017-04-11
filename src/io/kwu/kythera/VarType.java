package io.kwu.kythera;

import java.util.ArrayList;

// oooooooooohhhh boy
public abstract class VarType {
	// string representing type as Kythera would see it
	public final String type;

	public VarType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object other) {
			if(!(other instanceof VarType)) {
				return false;
			}

			VarType otherVar = (VarType) other;
			return otherVar.type.equals(this.type);
	}

	// types with the same form (e.g. all ints will be "int")

	public static VarType IntVarType = new VarType("int") {};

	public static VarType FloatVarType = new VarType("float") {};

	public static VarType StrVarType = new VarType("str") {};

	public static VarType NullVarType = new VarType("null") {};

	public class FnVarType extends VarType {
		protected final ArrayList<VarType> argList;
		protected final VarType returnType;

		public FnVarType(String type) {
			super(type);
			this.argList = new ArrayList<>();
			this.returnType = VarType.NullVarType;
		}

		public FnVarType(String type, ArrayList<VarType> argList, VarType returnType) {
			super(type);
			this.argList = argList;
			this.returnType = returnType;
		}

		@Override
		public boolean equals(Object other) {
			if(!(other instanceof VarType.FnVarType)) {
				return false;
			}

			VarType.FnVarType otherVar = (VarType.FnVarType) other;
			return otherVar.argList.equals(this.argList) && otherVar.returnType.equals(this.returnType);
		}
	}

	public class ObjVarType extends VarType {
		protected final ArrayList<VarType> propList;
	}
}
