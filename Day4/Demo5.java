package Day4;

class Sample45{
    public Sample45(){
        System.out.println("This is the constructor.");
    }
    int x = 10;
    void print(){
        System.out.println("Print function.");
    }
}

public class Demo5 extends Sample45{
    public Demo5(){
        super();
    }
    void Show(){
        int y = 45;
        super.print();
        System.out.println(super.x);
        System.out.println(y);
    }
    public static void main(String[] args){
        Demo5 t1 = new Demo5();
        t1.Show();
    }
}
