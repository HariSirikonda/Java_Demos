//Conditional Control Statements
import java.util.*;

public class Demo1 {
    void CheckParity(int x){
        //Even number condition
        if(x%2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    void EligibleToVote(int age){
        if(age >= 0 && age<=100){
            if (age >= 18){
                System.out.println("This person is eligible to vote.");
            }
            else{
                System.out.println("This person is not eligible to vote.");
            }
        }
        else{
            System.out.println("Enter a valid Age..!");
        }
    }
    void Festivals(String color){
        switch (color){
            case "orange":
                System.out.println("Hanuman Jayanthi");
                break;
            case "white":
                System.out.println("Cristamas");
        }
    }
    void calculateAreaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area : " + area);
    }
    public static void main(String[] args){
        Demo1 obj = new Demo1();
        obj.calculateAreaOfSquare();
    }
}
