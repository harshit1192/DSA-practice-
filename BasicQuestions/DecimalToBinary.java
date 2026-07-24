package BasicQuestions;
import java.util.*;
public class DecimalToBinary {
    public static void DecToBin(int n){
        int pow = 0;
        int BinNum = 0;
        while(n>0){
            int rem = n%2;
            BinNum = BinNum + (rem*(int)Math.pow(10,pow));
            pow++;
           n=n/2;  
        }
        System.out.print(BinNum);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DecToBin(n);
     sc.close();
    }
}
