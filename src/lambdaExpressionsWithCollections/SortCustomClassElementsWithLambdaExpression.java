package lambdaExpressionsWithCollections;

import java.util.*;

class Employee {
	
	int        empId;
	String  empName;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "[ Employee ID - " + empId + " , Employee Name - " + empName + "]\n";
	}
}


public class SortCustomClassElementsWithLambdaExpression {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Abinas1"));
		employees.add(new Employee(2, "Abinash2"));
		employees.add(new Employee(5, "Abinash5"));
		employees.add(new Employee(4, "Abinash4"));
		employees.add(new Employee(3, "Abinash3"));
		
		System.out.println("Before sorting the Employee records : \n" + employees);
		
		// Add Customized sorting (Descending order)
		Comparator< Employee> comparator = (Employee obj1, Employee obj2) -> {
			if (obj1.empId > obj2.empId)
				return -1;
			else if(obj1.empId < obj2.empId)
				return 1;
			else 
				return 0;
		};
		
		Collections.sort(employees, comparator);
		
		System.out.println("After sorting the Employee records : \n" + employees);
		
	}

}
