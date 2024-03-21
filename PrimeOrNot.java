import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("enter a number :");
    int a = in.nextInt();
    boolean prime = prime(a);
    System.out.println(prime);
    }
    public static boolean prime(int n){
        if(n == 1)
         return false;
        for(int i = 2; i*i<=n; i++){
            if(i%n==0)
            return false;
        }
        return true;

    }
}
