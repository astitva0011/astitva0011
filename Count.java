
public class Count {
  public static void main(String[] args) {
    int count =0;
    int n = 1234;
    int ans=0;
    while(n>0){
     int rem = n%10;
        
      count++;
    
      n = n /10;
      ans = ans * 10 + rem;
    }
     System.out.println(ans);
 }
}
