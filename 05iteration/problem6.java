/*
                    * * * * * * 
                    * * * * *
                    * * * *
                    * * *
                    * *
                    *
 */
import java.util.Scanner;

// package 05iteration;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
