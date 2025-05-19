package Day_5;
import java.util.*;

public class Demo2 {
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
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
