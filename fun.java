import java.util.*;
public class fun{
    public static void main(String[] args) { 
       int ans = sum2();
       System.out.println(ans);
    }
    static int sum2(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter a :");
          int a = input.nextInt();
       
        System.out.print("enter B: ");
          int b = input.nextInt();

        int sum = a+b;
     return sum;
    }
}