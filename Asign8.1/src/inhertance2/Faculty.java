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
	@Override // help to get error to see differentiate form overiden function and if see any change give error on line otherwise overload
	public String getDetails(/* int x */) {
		return "Faculty " + super.getDetails() 		+ " exp in yrs " + this.yrsOfExperience + " expert in " + sme;
	}
	public String toString(/* int x */) {
		return "Faculty " + super.toString() 		+ "\n exp in yrs " + this.yrsOfExperience + "\n expert in " + sme;
	}
	public int getYrsOfExperience() {
		return yrsOfExperience;
	}
	public void setYrsOfExperience(int yrsOfExperience) {
		this.yrsOfExperience = yrsOfExperience;
	}
	public String getSme() {
		return sme;
	}
	public void setSme(String sme) {
		this.sme = sme;
	}
	public void teach() {
		System.out.println(super.getDetails()+" please teach at assigned class ");
	}

}
