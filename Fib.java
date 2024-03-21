import java.util.*;
public class Fib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number till you want fib series: ");
        int n = input.nextInt();
        int n1=0, fib;
        int n2=1;
        System.out.println("fib series till "+n+" is = \n");
        for(int i = 1; i <= n; i++){
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
         
        System.out.println(fib);
        }
    }
}
