package functionalInterface_Predicate;

import java.util.function.Predicate;

/**
 * @author abinash
 * Write a program to authenticate user by using Predicate
 */

class UserBean {
	private String userName;
	private String password;
	
	public UserBean() {
		super();
	}
	
	public UserBean(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
}

public class PredicateInterfaceDemo5 {
	
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter user Name : ");
		String userName = scanner.nextLine();
		System.out.println("Enter password : ");
		String password = scanner.nextLine();
		
		UserBean user = new UserBean(userName,password);
		System.out.println("Is a valid user ? \n " + authenticateUser(user));
		if(authenticateUser(user))
			System.out.println("It is a valid user.");
		else
			System.out.println("It is an invalid user.");
		
		scanner.close();
	}
	
	public static boolean authenticateUser(UserBean userBean) {
		Predicate<UserBean> p = user -> user.getuserName().equals("Abinash") && 
				                                                               user.getPassword().equals("abinash123");
		return isUserAuthenticated(p,  userBean);
	}
	
	public static boolean  isUserAuthenticated(Predicate<UserBean> p, UserBean userBean) {
		return p.test(userBean);
	}
	

}
