package functionalInterface_Predicate;

import java.util.function.*;
/**
 * @author abinash
 * Write a program to check if Software Engineer is allowed in PUB or not
 */
class SoftwareEngineer {
	private String name;
	private int age;
	private boolean isHavingGF;
	
	public SoftwareEngineer() {
		super();
	}
	
	public SoftwareEngineer(String name, int age, boolean isHavingGF) {
		super();
		this.name= name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setIsHavingGF(boolean isHavingGF) {
		this.isHavingGF = isHavingGF;
	}
	
	public boolean isHavingGF() {
		return isHavingGF;
	}
	
	@Override
	public String toString() {
		return "[ Name : " + this.name + " , Age: " + this.age + " ,Is Having GF ?  " + isHavingGF + " ]"; 
	}
	
}
public class PredicateInterfaceDemo6 {
	
	static SoftwareEngineer[] array = new SoftwareEngineer[] {
		new SoftwareEngineer("Durga",60, false),
		new SoftwareEngineer("Sunil",25, true),
		new SoftwareEngineer("Sayan",26, true),
		new SoftwareEngineer("Subbu",28, false),
		new SoftwareEngineer("Ravi",19, true)
	};
	
	public static void main(String[] args) {
		CheckAllowingInPub();
	}
	
	public static boolean CheckAllowingInPub() {
		Predicate<SoftwareEngineer> p = eng -> eng.getAge()>=18 && eng.isHavingGF();
		return isAllowedInPub(p,array);
	}
	
	public static boolean isAllowedInPub(Predicate<SoftwareEngineer> p, SoftwareEngineer[] array) {
		boolean isAllowed = false;
		for(SoftwareEngineer se : array) {
			if(p.test(se)) {
				isAllowed=true;
				System.out.println("Allowed engineer information: " + se.toString());
			}
		}
		return isAllowed;
	}

}
