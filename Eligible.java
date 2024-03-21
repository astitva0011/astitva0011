import java.util.*;
public class Eligible {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("enter age");
        int age = in.nextInt();
        if(age>18){
            System.out.println("the voter is eligible to vote");
        }   
        else{{
            System.out.println("the voter is not eligible to vote");
        }}

    }
}


