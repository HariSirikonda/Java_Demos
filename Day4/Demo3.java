package Day4;

class Test{
    void add(){
        System.out.println("This is Addition method.");
    }
}
interface Inter{
    void sub();
}
//One class and one interface brought at a time
public class Demo3 extends Test implements Inter{
    public void sub(){
        System.out.println("This is Subtraction method.");
    }
    public static void main(String[] args){
        Demo3 obj = new Demo3();
        obj.add();
        obj.sub();
    }
}
