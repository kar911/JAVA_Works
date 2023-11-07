package inhertance2;

public class Faculty extends Person {
	private int yrsOfExperience;
	private String sme;

	public Faculty(String firstName, String lastName, int yrsOfExperience, String sme) {
		super(firstName, lastName);
		System.out.println("in faculty'c ctor");
		this.yrsOfExperience = yrsOfExperience;
		this.sme = sme;
	}

//overriding form of the method
	@Override
	public String toString() {
		return "Faculty " + super.toString() + " exp in yrs " + this.yrsOfExperience + " expert in " + sme;
	}

	// add teach method : Faculty specific functionality
	public void teach() {
		System.out.println(getLastName() 
				+ " training for " + yrsOfExperience + " in " + sme);
	}

}
