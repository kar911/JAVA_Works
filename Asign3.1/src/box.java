//import java.util.Scanner;
//public class box {
//	private double l,b,h; //heap
//	box(double l, double b,double h){ //stack data
//		this.l=l;
//		this.h=h;
//		this.b=b;
//	}
//	void dim() {
//		System.out.println("Lenght : "+this.l+"\nHeight : "+this.h+"\nBreadth : "+this.b);
//	}
//	void getl(double x) {
//		l=x;
//	}
//	double volume() {
//		return  this.l*this.h*this.b;
//	}
//	static void lpo() {
//		System.out.println("something");
//	}
//	boolean doubleDepth() {
//		if (volume() < 100) {
//			h=2*h;
//			return true;
//		}
//		return false;
//	}
//
//}
//class newclass extends box{
//	newclass(double l, double b, double h) {
//		super(l, b, h);
//	}
//
//	public static void main(String[] arg) {
//		Scanner jj =new Scanner(System.in);
//		newclass n=new newclass(jj.nextDouble(),jj.nextDouble(),jj.nextDouble());
//		n.dim();
//		System.out.println(n.volume());
//		jj.close();
//	}
//}







class box {
    private double l,b,h; //heap

    box(double l, double b,double h){ //stack data
        this.l=l;
        this.h=h;
        this.b=b;
    }

    void dim() {
        System.out.println("Length : "+this.l+"\nHeight : "+this.h+"\nBreadth : "+this.b);
    }

    void getl(double x) {
        l=x;
    }

    double volume() {
        return  this.l*this.h*this.b;
    }
    void offset(double l, double b,double h) {
        this.l=this.l+l;
        this.b=this.b+b;
        this.h=this.h+h;
        System.out.println(volume());
    }

    static void lpo() {
        System.out.println("something");
    }

    boolean doubleDepth() {
        if (volume() < 100) {
            h=2*h;
            return true;
        }
        return false;
    }
    boolean doublewidth() {
    h= volume() <100 ? h*2 : h;
     return 	volume() < 100 ?  true : false;

    }
    
}


