//Print the table of a number input by the number
// package 05iteration;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number print table");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
        sc.close();
    }
    
}
