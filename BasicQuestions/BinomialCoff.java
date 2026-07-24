package BasicQuestions;
import java.util.*;

public class BinomialCoff {
    public static int BinomialCoffecient(int n,int r){
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_r_n = factorial(n-r);
       int BinomialCoffecient = fact_n/(fact_r*(fact_r_n));
       return BinomialCoffecient;
    }
    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       // factorial(n);
        System.out.print(BinomialCoffecient(n,r));
        sc.close();
    }
}
