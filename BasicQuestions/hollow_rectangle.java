package BasicQuestions;
import java.util.*;
public class hollow_rectangle {
    public static void hol_rect(int rows , int col){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                if(i==1|| i==rows||j==1||j==col){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int Col = sc.nextInt();
        hol_rect(rows, Col);
        sc.close();
    }
    
}
