import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
               System.out.print("*");
            }
            int space=2*(n-i-1);
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
             }
            System.out.println();
            }
            for (int i=n; i>0; i--){
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                int space=2*(n-i);
                for(int j=0; j<space; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
            sc.close();
            
        }

        
    }
