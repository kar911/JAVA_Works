package inhertance2;

public class TennisPlayer extends Player {
	private int matches;

	public TennisPlayer(String firstName, String lastName, int a, int run) {
		super(firstName, lastName,a);
//		System.out.println("in faculty'c ctor");
		this.matches = run;
	}
//overriding form of the method
	@Override // help to get error to see differentiate form overiden function and if see any change give error on line otherwise overload
	public void play(/* int x */) {
		super.play();
		System.out.println("Name : "+ super.getname() +"\nMatches"+ matches);
	}
//	public String toString(/* int x */) {
//		return "Faculty " + super.toString() 		+ "\n exp in yrs " + this.yrsOfExperience + "\n expert in " + sme;
//	}

}
