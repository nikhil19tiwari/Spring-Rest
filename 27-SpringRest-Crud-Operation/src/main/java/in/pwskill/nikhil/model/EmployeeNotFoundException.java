package in.pwskill.nikhil.model;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 public EmployeeNotFoundException(){
		System.out.println("Default Constructor is called");
	}
 public EmployeeNotFoundException(String msg){
		super(msg);
		System.out.println("Parameterized Constructor is called");
	}

}
