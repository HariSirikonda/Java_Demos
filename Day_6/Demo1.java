package Day_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try{
            System.out.print("Enter value of a : ");
            a = sc.nextInt();
            System.out.print("Enter value of b : ");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Result : "+c);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }catch (InputMismatchException e){  //Multiple catch blokcs also allowed here
            System.out.println(e.getMessage());
        }
    }
}
