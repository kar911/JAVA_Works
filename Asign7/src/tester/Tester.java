package tester;
import java.util.Scanner;

import define.*;
public class Tester {
public static void main(String[] args) {
	Computable c1= null;
	Scanner s=new Scanner(System.in);
	try{
		xx(c1,s);
	}
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	}



  static void xx(Computable c1,Scanner s) throws ArithmeticException{
	switch (s.nextInt()) {
	case 1:
		c1=new Adder();
		System.out.println( c1.compute(s.nextDouble() , s.nextDouble()));
		break;
	case 2:
		c1=new Subber();
		System.out.println( c1.compute(s.nextDouble() , s.nextDouble()));
		break;
	case 3:
		c1=new Multi();
		System.out.println( c1.compute(s.nextDouble() , s.nextDouble()));
		break;
	case 4:
		c1=new Divider();
		System.out.println( c1.compute(s.nextDouble() , s.nextDouble()));
		break;

	default:
		System.out.println("Bye DD");
		break;
	}
}

}
