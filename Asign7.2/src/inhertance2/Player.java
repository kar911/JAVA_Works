package inhertance2;

public class Player {
	private String name, country;
	private int age;

	// add a parametrized ctor to init state of the person
	public Player(String firstName, String lastName,int a) {
//		System.out.println("in person's ctor");
		name = firstName;
		country = lastName;
		age=a;
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
	public String getname() {
		return name;
	}
	public void play(){
		System.out.println( "Playing a sport ! ");
	}
//	public String toString() {
//		return  "toString func form Obbject class is overloaded"+this.firstName+" "+this.lastName;
//	}
//	public String toString() {
//		return  "Player Name is "+this.name+" "+this.country+" "+this.country;
//	}
}
