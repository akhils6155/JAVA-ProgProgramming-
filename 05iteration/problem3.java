/*
Print this Pattern
            *****
            *****
            *****
            *****
*/
// package 05iteration;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of term");
       int n = sc.nextInt();
       for (int i=1;i<=n;i++){
        for (int j=1;j<=n+1;j++){
            System.out.print("*");
        }
        System.out.println("");
       }
       sc.close(); 
    }
    
}
