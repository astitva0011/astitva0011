import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        
      //    fun(34,43,54,45,45,54,45,45,45);
      //  fun("astitva");
        String ans = sum("astitva","gangwar","s34");
            System.out.println(ans);
    }

    static void fun(int ...a){
        System.out.println("first one");
        System.out.println(Arrays.toString(a))        ;
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
    static String sum(String a, String b){
        return a+b;
    }
    static String sum(String a,String b,String c){
        return a+b+c;
    }
}
