package inhertance2;

public class Person {
	private String firstName;
	private String lastName;

	// add a parametrized ctor to init state of the person
	public Person(String firstName, String lastName) {
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person()
//	{
//		
//	}
	//override the inherited toString method :  to return Person's details
	/*
	 * Object class Method
	 * public String toString()
	 */
	public String getDetails(){
		return "getDetails func "+this.firstName+" "+this.lastName;
	}
//	public String toString() {
//		return  "toString func form Obbject class is overloaded"+this.firstName+" "+this.lastName;
//	}
	public String toString() {
		return  "Name is "+this.firstName+" "+this.lastName;
	}
	public boolean equals(Person o) {
		return this.firstName.equals(o.firstName) && this.lastName.equals(o.lastName) ;
	}
}
