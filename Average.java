import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int av =0;
        int sum =0;
        System.out.println("ente numbers");
        int a = input.nextInt();
       while(a!=0){
        sum += a%10;
        a/=10;
    }
       
      System.out.println(sum);    
      
      System.out.println((float)a/sum);
     
    }

}