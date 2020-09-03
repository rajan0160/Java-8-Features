package StreamsWithCollections;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		List <Integer> minAndMax=new ArrayList<>();
		minAndMax.add(10);
		minAndMax.add(40);
		minAndMax.add(60);
		minAndMax.add(20);
		minAndMax.add(50);
		minAndMax.add(30);
		
		System.out.println(minAndMax);
		Integer min=minAndMax.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min Val: "+min);
		
		Integer max=minAndMax.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max Val: "+max);
		
		System.out.println("===========Difference type====================");
		
		Integer min2=minAndMax.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Min Val: "+min2);
		
		Integer max2=minAndMax.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Max Val: "+max2);
		
	}

}
