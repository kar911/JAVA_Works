import java.util.Scanner;
class box2{
    public static void main(String[] args) {
        Scanner jj =new Scanner(System.in);
        box n=new box(jj.nextDouble(),jj.nextDouble(),jj.nextDouble());
        n.dim();
        System.out.println(n.volume());
        box.lpo();
        System.out.println(n.hashCode());
        n.offset(jj.nextDouble(),jj.nextDouble(),jj.nextDouble());
        System.out.println(n.hashCode());
        jj.close();
    }
}


//649734728
//649734728