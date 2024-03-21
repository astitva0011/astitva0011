import java.util.*;
public class SumofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number :");
        int a = in.nextInt();
        System.out.println("enter second number: ");
        int b = in.nextInt();
        sum(a,b);
    }
    public static void sum(int a, int b){
        int sum=0;
        sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is = "+sum);
    }
}
