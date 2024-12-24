import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Output
        System.out.print("This is First line");  //System.out.print() function display output in same line
        System.out.print("This is Second line");

        System.out.println("This is Third line"); //System.out.println() function display the output in the functin always new line
        System.out.println("This is Fourth line");

        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My Name is "+name);

        sc.close();

    }
}
