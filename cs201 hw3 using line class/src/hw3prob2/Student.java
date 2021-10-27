package hw3prob2;

public class Student {

	private String lastName;
	private String firstName;
	private String fullName;
	
	public Student() {
		lastName = "n/a";
		firstName = "n/a";
		fullName = lastName + ", " + firstName;
	}
	
	public Student(String ln, String fn) {
		lastName = ln;
		firstName = fn;
		fullName = lastName + ", " + firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	
	public String toString() {
		return "(" + fullName + ")";
	}
	
	
	
}
