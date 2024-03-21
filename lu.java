import java.util.*;
public class lu{
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
    
    if(ch >= 'a' && ch <='z'){
        System.out.println("Lowercase");
    }
    else{
        System.out.println("Uppercase");
    }
    }

}