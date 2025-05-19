abstract class Test {
    abstract void add();

    abstract void sub();

    static void mul() {
        int a = 10, b = 20;
        System.out.println(a * b);
    }

    String name() {
        String n = "Hari Sirikonda";
        return n;
    }
}

public class Demo4 extends Test {
    public void add() {
        System.out.println("This is addition function..!");
    }

    // Calling the sub method
    public void sub() {
        System.out.println("This is the subtraction function definition..!");
    }

    public static void main(String[] args) {
        Demo4 obj = new Demo4(); // Created an object for demo
        obj.add();
        Test.mul();
        String Name = obj.name();
        System.out.println(Name);
    }

}
