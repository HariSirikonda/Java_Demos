package Assignment;

interface Addition {
    void add();
}

interface Subtraction {
    void subtract();
}

interface Multiplication extends Addition, Subtraction {
    void multiply();
}

public class CalculatorOperations implements Multiplication {
    public void add() {
        System.out.println("Performing addition");
    }
    public void subtract() {
        System.out.println("Performing subtraction");
    }
    public void multiply() {
        System.out.println("Performing multiplication");
    }

    public static void main(String[] args) {
        CalculatorOperations calc = new CalculatorOperations();
        calc.add();
        calc.subtract();
        calc.multiply();
    }
}
