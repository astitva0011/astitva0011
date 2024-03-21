import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float si = (p * r * t)/100;
        System.out.println("Simple interest "+ si);
    
    }
}