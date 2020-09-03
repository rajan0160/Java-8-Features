package StreamsWithCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByLengthOfElements {

	public static void main(String[] args) {
		List <String> sortedByLengthOfElements=new ArrayList<>();
		sortedByLengthOfElements.add("AA");
		sortedByLengthOfElements.add("R");
		sortedByLengthOfElements.add("JJJ");
		sortedByLengthOfElements.add("HHHHHH");
		sortedByLengthOfElements.add("SSSSS");
		sortedByLengthOfElements.add("EEEE");
		sortedByLengthOfElements.add("R");
		sortedByLengthOfElements.add("EE");
		
		
		System.out.println(sortedByLengthOfElements);
		Comparator <String> order=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			
			if(l1<l2)return -1;
			else if(l1>l2) return 1;
			else return (s1).compareTo(s2);
		};
		
		//Comparator <String> order=(s1,s2)->{int l1=s1.length(); int l2=s2.length(); return (l1).compareTo(l2);};
			
		
		List<String> sortedByLengthOfElements2=sortedByLengthOfElements.stream().sorted(order).collect(Collectors.toList());
		System.out.println(sortedByLengthOfElements2);
			
		System.out.println("===================== And Alphabatic Order=======================");
		
		List<String> sortedOrderByAlpabatic=sortedByLengthOfElements.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sortedOrderByAlpabatic);
		
	}

} 
