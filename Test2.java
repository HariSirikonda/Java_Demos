public class Test2 {
    int a = 34;
    int b = 40;
    public Test2(int x, int y){
        this.a = x;
        this.b = y;
    }
    //Copy constructor
    public Test2(Test2 t1){
        this.a = t1.a;
        this.b = t1.b;
    }
    public static void main(String[] args){
        Test2 t1 = new Test2(10,20);
        Test2 t2 = new Test2(t1);
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println("After copying..!");
        System.out.println(t2.a);
        System.out.println(t2.b);
    }
}
