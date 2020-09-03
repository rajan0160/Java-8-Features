package PredefinedFunctionInterface;

@FunctionalInterface
 interface TwoFunctionalInterfaceWithOverriden1 {
 
	public void m1();
}

interface TwoFunctionalInterfaceWithOverriden2 extends TwoFunctionalInterfaceWithOverriden1{
	public void m2();    //it is normal interface 
	public void m3();   //it's not applicable to Functional Interface. Because i can't declare @Functional Interface in top of TwoFunctionalInterfaceWithOverriden2.class
}

public class TwoFunctionalInterfaceWithOverriden{
	public static void main(String[] args) {
		//Error-> The target type of this expression must be a functional interface
		//TwoFunctionalInterfaceWithOverriden2 tf2=()->System.out.println("Error-Lambda expression is applicable for Functional Interface");
		
		TwoFunctionalInterfaceWithOverriden1 tf2=()->System.out.println("sucess-Lambda expression is applicable for Functional Interface");
	tf2.m1();
	}
}