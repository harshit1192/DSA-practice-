package BasicQuestions;
import java.util.*;
public class inverted_pramid {
    public static void half_pramid(int row ){
        //outer loop
        for(int i=1;i<=row;i++){
            //spaces
             for(int j=1;j<=row-i;j++){
              System.out.print(" ");
             }
             //stars
             for(int j=1;j<=i;j++){
                System.out.print("*");
             } 
             System.out.println();
        }
         
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        half_pramid(row);

        sc.close();
    }
    
}
