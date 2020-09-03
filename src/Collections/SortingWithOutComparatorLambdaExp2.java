package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithOutComparatorLambdaExp2 {

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
	
	System.out.println("==============Decending Order=================");
	//Comparator <Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;  // 3) Comparator long with Lambda 
	Collections.sort(sortElements, new MyComparator());
	System.out.println(sortElements);

	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		if(o1.equals(o2)) {                          //1) return without expression
//			return 1;
//		}else if(!o1.equals(o2)) {
//			return -1;
//		}else  {
//			return 0;
//		}
		
		return o1.equals(o2)?1:!o1.equals(o2)?-1:0;     //2) return with expression
		
	}
	
}
