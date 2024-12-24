import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        System.out.println("Find largest number in given three number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        if (a>b){
            if(a>c){
                System.out.println("Largest number is: "+a);

            }
            else{
                System.out.println("Largest number is: "+c);
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("Largest number is: "+b);
            }
            else{
                System.out.println("Largest number is: "+c);
            }
        }
        else{
            System.out.println("Largest number is: "+c);
        }
        sc.close();
    }
}
