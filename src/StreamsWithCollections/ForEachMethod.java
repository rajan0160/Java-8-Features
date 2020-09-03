package StreamsWithCollections;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List <Integer> minAndMax=new ArrayList<>();
		minAndMax.add(10);
		minAndMax.add(40);
		minAndMax.add(60);
		minAndMax.add(20);
		minAndMax.add(50);
		minAndMax.add(30);
		
		System.out.println(minAndMax);
		
		minAndMax.stream().forEach(System.out::println);
		
		minAndMax.parallelStream().forEach(i->System.out.println(i+"*"+i+"="+(i*i)));
		
		System.out.println("==================WithOut Stream direct Declare ForEach()===================================");
		
		minAndMax.forEach(i->System.out.println("Without Stream declare ForEach() :"+i));

	}

}
