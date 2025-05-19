class FixedAmount {
    int FixedAmount = 10000;
}

abstract class Withdraw {
    abstract void withdraw(int amount);
}

public class Demo5 extends Withdraw {
    FixedAmount f1 = new FixedAmount();

    void withdraw(int amount) {
        f1.FixedAmount -= amount;
        System.out.println("withdrawn : " + amount);
        System.out.println("Available balance : " + f1.FixedAmount);
    }

    public static void main(String[] args) {
        Demo5 d1 = new Demo5();
        d1.withdraw(500);
    }
}
