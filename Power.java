import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int n = input.nextInt();
        System.out.println("enter power");
        int p = input.nextInt();
        int c=p;
        int power=1;
       while(p!=0){
            power*=n;
            p--;
        }
        System.out.println(power);
       
    }
}
