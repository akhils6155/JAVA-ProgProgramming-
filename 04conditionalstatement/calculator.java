import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------- Basic Calculator ---------------");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
        System.out.println("Enter your choice (1/2/3/4/5):");
        int choice = sc.nextInt();
        System.out.print("Enter the First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        switch (choice){
            case 1:
                System.out.printf("Addition of the two number %d and %d is %d",a,b,a+b);
                break;
            case 2:
                System.out.printf("Subtraction of the two number %d and %d is %d",a,b,a-b);
                break;
            case 3:
                System.out.printf("Multiple of two number %d and %d is %d ",a,b,a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Error! Division by zero is not allowed.");
                }
                else{
                    System.out.printf("Division of the two number %d and %d is %d",a,b,a/b);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
