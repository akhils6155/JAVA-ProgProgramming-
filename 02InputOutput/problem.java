// package 02InputOutput;
import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        int a,b,sum;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a= sc.nextInt();
        b= sc.nextInt();
        sum = a+b;
        System.out.println("Sum of two numbers is: "+sum);
        sc.close();
    }
    
}
