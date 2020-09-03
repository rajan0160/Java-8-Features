package PredefinedFunctionInterface;

import java.util.function.Function;

public class FuntionWithApplyMethod {
//public static Integer f(Integer i) {
//	return i*i;
//}
	public static void main(String[] args) {
		Function<Integer, Integer> f=i->{
			return i*i;
		};
		Integer fw=f.apply(20);
		System.out.println(fw);
		
		System.out.println("10*10= "+f.apply(10));
		
		
	}

}
