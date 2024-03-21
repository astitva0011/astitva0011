import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
       Scanner in  = new Scanner(System.in);
       System.out.println("enter first num :");
       int f = in.nextInt();
       System.out.println("enter second number");
       int s= in.nextInt();
       System.out.println("enter third number:");
       int t= in.nextInt();
        int largest = largest(f,s,t);
        int smallest = smallest(f,s,t);
        System.out.println("largest is :"+largest);
        System.out.println("smallest number is :"+smallest);
        }
       public static int largest(int f,int s,int t){
        int max  = f;
        if(s>max){
            max = s;    
        }
        if(t>max){
            max = t;
        } 
       return max;
        
    }
    public static int smallest(int f,int s,int t){
        int min = f;
        if(s<min){
            min = s;
        }
        if(t<min){
            min =t;
        }
        return min;
    }
    
}
