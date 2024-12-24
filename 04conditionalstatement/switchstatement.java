import java.util.Scanner;

public class switchstatement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello.");
                break;
            case 3:
                System.out.println("Bye!!!");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        sc.close();
    }
}
