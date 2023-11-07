package newproj;
import java.util.*;

class RegisCust2 {
	   public static void main(String[] arg) {
		   Scanner lp=new Scanner(System.in);
//		   double r=lp.nextDouble()
		   customers j =new customers(lp.next(),lp.next(),lp.nextInt(),lp.nextDouble());
		   System.out.println( j.custdetail());
	   }
}
