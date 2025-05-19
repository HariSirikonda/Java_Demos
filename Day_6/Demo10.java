package Day_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);
    }
}
