package newproj;
import java.util.Scanner;
import java.lang.Math;
public class maths {

	public static void main(String[] args) {
//		Scanner rr = new Scanner(System.in);
//		while(true) {
//		    String what = rr.next();
//		    what = what.toLowerCase();
//		    Double n1, n2;
//		    if( "quit".equals(what) ) {
//		        break;
//		    } else if("add".equals(what)) {
//		        n1 = rr.nextDouble();
//		        n2 = rr.nextDouble();
//		        System.out.println(n1 + n2);
//		    } else if("sub".equals(what)) {
//		        n1 = rr.nextDouble();
//		        n2 = rr.nextDouble();
//		        System.out.println(n1 - n2);
//		    } else if("mult".equals(what)) {
//		        n1 = rr.nextDouble();
//		        n2 = rr.nextDouble();
//		        System.out.println(n1 * n2);
//		    } else if("div".equals(what)) {
//		        n1 = rr.nextDouble();
//		        n2 = rr.nextDouble();
//		        if (n2 != 0) {
//		            System.out.println(n1 / n2);
//		        } else {
//		            System.out.println("Do not divide anything by zero!");
//		        }
//		    } else {
//		        System.out.println("What?");
//		        System.out.println(what.toLowerCase());
//		    }
//		}
//		rr.close();
		Scanner rr = new Scanner(System.in);
		Double pri= rr.nextDouble();
		Float ir= rr.nextFloat();
		int time = rr.nextInt();
		Double c;
		c=pri* Math.pow ((1+(ir/100)),time)-pri;
				System.out.println("compound is "+c);
		rr.close();
	}

}
