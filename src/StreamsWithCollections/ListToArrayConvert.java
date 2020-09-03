package StreamsWithCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToArrayConvert {

	public static void main(String[] args) {
		List <Integer> minAndMax=new ArrayList<>();
		minAndMax.add(10);
		minAndMax.add(40);
		minAndMax.add(60);
		minAndMax.add(20);
		minAndMax.add(50);
		minAndMax.add(30);
		
		System.out.println(minAndMax);
		
		Integer [] i=minAndMax.stream().toArray(Integer[]::new);
		for(Integer i2:i) {
			System.out.println(i2);
		}
		System.out.println("==================== Array convert stream() with use Of()===================");
		Stream.of(i).forEach(j->System.out.println(j+"*"+j+"="+(j*j)));
		
		Stream.of(i).forEach(System.out::println);
	}

}
