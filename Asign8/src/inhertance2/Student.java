package inhertance2;

public class Student extends Person {
	//add state / attributes : grad year,course,fees,marks
	private int gradYear;
	private String course;
	private int fees;
	private int marks;
	//add sub class ctor
	public Student(String fn,String ln,int year,String course,int fees,int marks) {
		//invoke explicitly immeditate super cls's parameterized ctor
		super(fn,ln);
		System.out.println("in student's ctor");	
		//init remaining state
		this.gradYear=year;
		this.course=course;
		this.fees=fees;
		this.marks=marks;
		
	}
	
	//added by javac impl
//	public Student() {
//		super();
//	}
	//overriding(modifying existing inherited behavior) the toString method
	//to return COMPLETE student details
	@Override
	public String toString()
	{
		return "Student " +super.toString() +"graduated in "
	+this.gradYear+" marks="+this.marks+" enrolled in "+course+" fees "+this.fees;
	}
	//add student specific functionality : study --to display firstname of the 
	//student n course name
	public void study() {
		System.out.println(super.getFirstName()
				+" studying in course "+this.course);
	}
	
}
