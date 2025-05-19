package Day4;
class Animal {
    void sleep() {
        System.out.println("The animal sleeping.");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("The dog is barking.");
    }
}

public class Demo1 {

    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sleep();
        d1.Bark();
    }
}
