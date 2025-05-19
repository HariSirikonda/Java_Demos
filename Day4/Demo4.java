package Day4;

interface Inter1{
    void method1();
}
interface Inter2{
    void method2();
}

//deriving interfaces into another interface
interface I3 extends Inter1, Inter2{
    void method3();
}

public class Demo4 implements I3{
    public void method1(){
        System.out.println("Hai");
    }
    public void method2(){
        System.out.println("Hello");
    }
    public void method3(){
        System.out.println("welcome");
    }
    public static void main(String[] args){
        Demo4 obj = new Demo4();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
