import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbr of rows: ");
        int n = sc.nextInt();
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                    // num--;
                }
                else{
                    System.out.print("0"+" ");
                    // num++;
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
