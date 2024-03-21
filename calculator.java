import java.util.*; 
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;         
       
        while(true){
            System.out.println("enter an operator\n");
             char op = input.next().trim().charAt(0);
             System.out.println("\n");

        if(op == '+' || op == '*' || op == '-' || op == '/' || op == '%' ){
            
            System.out.print("enter two numbers \n");

            int a = input.nextInt();
            int b = input.nextInt();
           
            if(op == '+'){
                sum = a+b;
            }else if(op =='-'){
                sum = a-b;
            }else if(op == '*'){
                sum = a*b;
            }else if(op == '%'){
                sum = a*b;
            }else if(op == '/'){
                if(a == 0 || b == 0){
                    System.out.println("0 can't be devided by anthingh!!\n");
                }else{
                    sum = a/b;
                }
            }
            }else if(op == 'x' || op == 'X'){
        break;}
        
        System.out.println("\nthe answer is :\n"+sum);

    }
    }
}

