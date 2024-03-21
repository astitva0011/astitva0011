import java.util.*;
public class AreaCircumfrence{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter radius of circle : ");
    double r = in.nextInt();
      aoc(r);
    }
    public static void aoc(double r){
        double area = Math.PI * (r*r);
        double c = Math.PI *2*r;
        System.out.println("area of cir circle is : "+area);
        System.out.println("circumfrence of circle is : "+c);
    }
}