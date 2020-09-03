package StreamsWithCollections;

import java.util.stream.Stream;

public class ArrayToStreamwithUseOFMethod {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		System.out.println(a);
		Stream.of(a).forEach(i->System.out.println(i));
		
		System.out.println("=============Use Type as Integer=================");
		
		Integer [] b= {10,20,30,40,50};
		System.out.println(b);
		Stream.of(b).forEach(i->System.out.println(i));
	}

}
