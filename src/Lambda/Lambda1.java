package Lambda;

import java.util.function.Function;

public class Lambda1 {

	public static void main(String[] args) {
		System.out.println("=====================Lambda Expression============================");
		Example e=(int a, int b)->{System.out.println("23333");};
		e.exam(20,50);
		
		e=(a,b)->System.out.println(a+"  and "+b);
		e.exam(30, 40);
		
		System.out.println("======================Function Interfaces methods==============================");
		Function <Integer,Integer> f2=z->{System.out.println("Sys"+z); return 10;};
		System.out.println(f2.apply(2));
		
		System.out.println("======================Function Interfaces methods with Multiple Parameters==============================");

		//Invalid Function Interface not accept Multiple Parameters.
		//Function <Integer, String, String, String> mulPara=(a,b,c)->{System.out.println(a+"==="+b+"==="+c); return a+"==="+b+"==="+c;};

	}

}

interface Example{
	void exam(int a, int b);
}

