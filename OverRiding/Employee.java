package OverRiding;
//child class
public class Employee extends Person {
	private String employeeId;
	private String title;
	
	public Employee() {
		super("Datch");
		System.out.println("this employee default constr");
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setgetEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//this method is Parent class
	public void setName(String name) {
		System.out.println(name + "****");
	}

}
