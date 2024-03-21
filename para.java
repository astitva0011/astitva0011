import java.util.*;
public class  para {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter two numbs :");
    int a = in.nextInt();
    int b = in.nextInt();
    int ans = sum(a,b);
    System.out.println(ans);

   
    }
    static int sum(int a, int b){
      int result = a+b;
      System.out.println("the ans is :");
      return result;
    }
}
