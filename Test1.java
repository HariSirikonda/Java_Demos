public class Test1
{
    static int radius = 10, side = 5;
    int ss = 100;
    void AreaOfCircle(){
        System.out.println(Test1.radius * Test1.radius * 3.14);
    }
    static void AreaOfRectangle(){
        System.out.println(Test1.side * Test1.side);
    }
    void AreaOfSquare(){
        System.out.println(ss * ss);
    }
    static void AreaOfTriangle(){
        int base = 10, height = 20;
        System.out.println(0.5 * base * height);
    }
    public static void main(String[] args){
        Test1 obj = new Test1();
        obj.AreaOfCircle();
        Test1.AreaOfRectangle();
        obj.AreaOfSquare();
        Test1.AreaOfTriangle();
    }
}
