package PredefinedFunctionInterface;

@FunctionalInterface
public interface DeclareFunctionInterfaceAnnotationWithOneAbstactMethod {
public void AA1();
//Error--> Invalid '@FunctionalInterface' annotation; DeclareFunctionInterface is not a functional interface
//Use @FunctionInterface annotation than declare only one abstract in one Function Interface
//public void AA2();
default int bb1() {
	System.out.println("Default Method name as bb()1");
	return 20;
}
default int bb2() {
	System.out.println("Default Method name as bb2()");
	return 30;
}
default int bb3() {
	System.out.println("Default Method name as bb3()");
	return 40;
}

public static String cc1() {
	return "Static Method name as cc1()";
}

public static String cc2() {
	return "Static Method name as cc2()";
}
public static String cc3() {
	return "Static Method name as cc3()";
}
}
