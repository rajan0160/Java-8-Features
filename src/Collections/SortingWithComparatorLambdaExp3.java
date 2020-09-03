package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWithComparatorLambdaExp3 {

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
	List sortElements2=sortElements.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	sortElements2.stream().forEach(System.out::println);
	sortElements2.stream().forEach(i->{System.out.println("Ascending  :"+i);});
	
	System.out.println("==============decending Order=================");
	List sortElements3=sortElements.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
    sortElements3.stream().forEach(System.out::println);
    sortElements3.stream().forEach(i->{System.out.println("Decending Order  :"+i); });

	}

}
