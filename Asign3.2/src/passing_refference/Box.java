package passing_refference;

public class Box {
	private double l,b,h;
	Box(double l1,double b1,double h1){
		l=l1;
		b=b1;
		h=h1;
	}
	Box offset(double l1,double b1,double h1) {
		return new  Box(l+l1,b+b1,h+h1);
	}
	public void showw(){
		System.out.println("L is "+l+"\nB is "+b+"\nH is "+h);
	}
	
}
