import java.util.*;
public class Armstrng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        int r;
        int temp = n;
        
        while(n>0){
          
            r = n % 10;
            sum += r*r*r;
            n = n /10;
              n++;  
        }
        if( n == temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

}