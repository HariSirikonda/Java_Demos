package Day_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo11 {
    void add(int a, int b) throws ArithmeticException, InputMismatchException{
        int c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Demo11 d1 = new Demo11();
        d1.add(10, 0);
    }
}
