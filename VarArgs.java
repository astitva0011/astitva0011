import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       // fun(1,3,4,5,6,7,8);
       // fun();//empty array of list
     //   multiple(1,3,"hello","world","lakshita","lovely");
     demo(32,3,32,23,23,3);
     demo("adsf","adsf","dfas");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){//for multiple types
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);

    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
