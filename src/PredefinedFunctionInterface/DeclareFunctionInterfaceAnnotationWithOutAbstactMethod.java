package PredefinedFunctionInterface;
@FunctionalInterface
public interface DeclareFunctionInterfaceAnnotationWithOutAbstactMethod {
//Use @FunctionalInterface then atleast one abstact method is mandatory
	//public void aa();
	
	default String bb() {
		return "Default method name as bb()";
	}
	public static String cc() {
		return "Static method name as cc()";
	}
}
