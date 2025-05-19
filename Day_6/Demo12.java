package Day_6;

import java.util.InputMismatchException;

public class Demo12 {
    static void add(int a, int b){
        if(b==0){throw new ArithmeticException("Denominator can't be zero.");}
        int c = a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Demo11 d1 = new Demo11();
        try{
            add(10, 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        d1.add(10, 0);
    }
}
