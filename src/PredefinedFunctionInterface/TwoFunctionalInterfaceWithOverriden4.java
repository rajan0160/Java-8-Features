package PredefinedFunctionInterface;

@FunctionalInterface
 interface TwoFunctionalInterfaceWithOverriden5 {
 
	public void m1();
}
@FunctionalInterface
interface TwoFunctionalInterfaceWithOverriden6 extends TwoFunctionalInterfaceWithOverriden5{
	//public void m2();    //it is normal interface 
	//public void m3();   //it's not applicable to Functional Interface. Because i can't declare @Functional Interface in top of TwoFunctionalInterfaceWithOverriden2.class
}

public class TwoFunctionalInterfaceWithOverriden4{
	public static void main(String[] args) {
		//Error-> The target type of this expression must be a functional interface
		//TwoFunctionalInterfaceWithOverriden2 tf2=()->System.out.println("Error-Lambda expression is applicable for Functional Interface");
		
		TwoFunctionalInterfaceWithOverriden5 tf2=()->System.out.println("sucess-Lambda expression is applicable for Functional Interface as TwoFunctionalInterfaceWithOverriden5");
		TwoFunctionalInterfaceWithOverriden6 tf3=()->System.out.println("sucess-Lambda expression is applicable for Functional Interface as TwoFunctionalInterfaceWithOverriden6");

		tf2.m1();
		tf3.m1();
	}
}