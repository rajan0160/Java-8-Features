package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWithComparatorLambdaExp {

	public static void main(String[] args) {
		List <Integer> sortElements=new ArrayList<>();
		sortElements.add(10);
		sortElements.add(5);
		sortElements.add(60);
		sortElements.add(20);
		sortElements.add(50);
		sortElements.add(40);
		sortElements.add(15);
		sortElements.add(30);
		
		System.out.println(sortElements);
		
		System.out.println("==============Ascending Order=================");
	Collections.sort(sortElements);
	System.out.println(sortElements);
	
	sortElements.stream().forEach(System.out::println);
	
	System.out.println("==============Decending Order=================");
	Comparator <Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
	Collections.sort(sortElements, c);
	System.out.println(sortElements);
	
	sortElements.stream().forEach(System.out::println);
	
	System.out.println("==============Ascending Order=================");
	List<Integer> s=sortElements.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(s);
	
	s.stream().forEach(System.out::println);
	s.stream().forEach(i->System.out.println("Ascending Order : "+i));
	
	System.out.println("==============Decending Order=================");
	List<Integer> dec=sortElements.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
	System.out.println(dec);
	
	dec.stream().forEach(System.out::println);
	dec.stream().forEach(i->System.out.println("Ascending Order : "+i));
	


	}

}
