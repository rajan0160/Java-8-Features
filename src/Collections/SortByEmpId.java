package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortByEmpId {
public static void main(String[] args) {
	List <Emp> empList=new ArrayList<>();
	empList.add(new Emp(1111,"fffff"));
	empList.add(new Emp(6666,"aaaaaa"));
	empList.add(new Emp(3333,"ddddddd"));
	empList.add(new Emp(2222,"ccccccc"));
	empList.add(new Emp(5555,"bbbbbbb"));
	empList.add(new Emp(4444,"eeeeeee"));
	
	empList.stream().forEach(i->System.out.println(i));
	
	System.out.println("========================Desending Order by Emp_Id===================================");
	Collections.sort(empList,(s1,s2)->(s1.emp_id < s2.emp_id)?1:(s1.emp_id > s2.emp_id)?-1:0);
	empList.stream().forEach(i->System.out.println(i));

	System.out.println("========================Desending Order by Emp_Name===================================");
	Collections.sort(empList,(s1,s2)->s1.emp_name.compareTo(s2.emp_name));
	System.out.println(empList);
	empList.stream().forEach(i->System.out.println(i));

}
}

class Emp{
	int emp_id;
	String emp_name;
	public Emp(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return emp_id+" "+emp_name;
	}
	
	
}