package passing_refference;
import java.util.*;
public class TestBox {
 public static void main(String[] a) {
	 Scanner sc=new Scanner(System.in);
	 Box b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	 Box b2=b1.offset(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	 b2.showw();
 }
}
