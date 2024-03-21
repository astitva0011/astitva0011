import java.util.*;
public class Parastr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = in.next();
        String personalised = greet(name);
        System.out.println(personalised);
    }

    static String greet(String name){
        String msg = "hello "+name;
    return msg;
    }    


}
