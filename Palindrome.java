import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
        isPalindrome(a);
        
    }
    public static void isPalindrome(int a){
        System.out.println("enter a number:");
        
        int rev = 0;
        int temp = a;
        while(temp!=0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if(a == rev){
           System.out.println(a +" is palindrome!!");
        }
        System.out.println(a + " is not palindrome!");
    }
    
}