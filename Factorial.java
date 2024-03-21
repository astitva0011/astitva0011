import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ente  a number :");
        int a = input.nextInt();
        int fact = fact(a);
        System.out.println("factorial of "+a+" = "+fact);
        
    }
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
}