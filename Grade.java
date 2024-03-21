import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter your marks :");
        int m = in.nextInt();
        System.out.println("you got Grade "+marks(m));
    }
    public static String marks(int m){
      
        if(m>40 && m<50){
            return "DD";
        }
        if(m>50 && m<60){
            return "CD";
        }
        if(m>60 && m<70){
            return "BC";
        }
        if(m>70 && m<80){
            return "BB";
        }
        if(m>80 && m<90){
            return "AB";
        }
        if(m>90){
            return "AA";
        }
        return "fail";
    }
}
