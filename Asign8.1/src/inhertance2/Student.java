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
	//overriding(modifying existing inherited behavior) the getDetails method
	//to return COMPLETE student details
	public String getDetails()
	{
		return "Student" +super.getDetails() +"\ngraduated in "
	+this.gradYear+"\nmarks="+this.marks+"\n enrolled in "+course+"\nwith fees "+this.fees;
	}
	public String toString()
	{
		return "Student " +super.toString() +"\ngraduated in "
	+this.gradYear+"\nmarks="+this.marks+"\n enrolled in "+course+"\nwith fees "+this.fees;
	}
	public void study() {
		System.out.println(super.getDetails()+" please study at assigned class ");
	}
}
