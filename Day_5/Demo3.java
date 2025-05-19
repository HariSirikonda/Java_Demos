package Day_5;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("Enter value of a : ");
            a = sc.nextInt();
            System.out.print("Enter value of b : ");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Result : " + c);
        } catch (Exception e) {
            //Three ways to print the exception
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
