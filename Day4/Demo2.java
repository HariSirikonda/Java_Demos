package Day4;

interface I1{
    void add();
}
interface I2 extends I1{
    void sub();
}

public class Demo2 implements I2{
    public void add(){
        System.out.println("This is Addition method.");
    }
    public void sub(){
        System.out.println("This is Subtraction method.");
    }
    public static void main(String[] args){
        Demo2 obj = new Demo2();
        obj.add();
        obj.sub();
    }
}