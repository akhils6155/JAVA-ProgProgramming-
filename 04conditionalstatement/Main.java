import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age= sc.nextInt();

        if (age>0){
            if(age<18){
                System.out.println("You are a minor");
            }
            else if(age>=18 && age<=65){
                System.out.println("You are an adult");
            }
            else{
                System.out.println("You are a senior");
            }
        }
        else{
            System.out.println("Plz Enter Valid Age\n----Thank You----");
        }
        sc.close();
    }
}
