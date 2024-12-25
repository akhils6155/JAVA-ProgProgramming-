// First n natural number sum
// package 05iteration;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int term = sc.nextInt();
       int sum = 0;
       for(int i=1; i<=term; i++){
        sum = sum + i;
       }
       System.out.println("Sum of first "+term+" natural numbers is "+sum);
       sc.close();
    }
}
