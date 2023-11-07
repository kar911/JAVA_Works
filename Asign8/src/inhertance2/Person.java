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
	// override the inherited toString method : to return Person's details
	/*
	 * Object class Method public String toString()
	 */
	@Override // method level compile time annotation :
	// to inform javac following is the overriding form of the method
	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person p=(Person)o;
			return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) ;
//			return this.firstName.equals(((Person)o).firstName) && this.lastName.equals(((Person)o).lastName) ;	
		}
		return false;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
