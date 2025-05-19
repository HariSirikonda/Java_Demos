package Day1;
class Sample23{
    public void add(int a, int b){
        System.out.println("Added : " + (a+b));
    }
    void sub(int c, int d) {
        System.out.println("Subtracted : " + (c - d));
    }
    protected void mul(int c, int d) {
        System.out.println("Subtracted : " + (c * d));
    }

}

public class Demo7 extends Sample23 {
    public static void main(String[] args){
        Sample23 s1 = new Sample23();
        s1.add(10,20);
    }
}
