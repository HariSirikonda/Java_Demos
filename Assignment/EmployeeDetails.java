package Assignment;

interface Employee {
    void showName();
}

interface EmployeeId extends Employee {
    void showId();
}

class TemporaryEmployee implements Employee {
    public void showName() {
        System.out.println("Employee Name: Sanjana");
    }
    public void showId() {
        System.out.println("Employee ID: 297");
    }
    public void greet() {
        System.out.println("Hello!");
    }
}

class PermanentEmployee implements EmployeeId {
    public void showName() {
        System.out.println("Employee Name: Sreeja");
    }
    public void showId() {
        System.out.println("Employee ID: 257");
    }
    public void showRollNumber() {
        System.out.println("Roll Number: 288");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        TemporaryEmployee temp = new TemporaryEmployee();
        PermanentEmployee perm = new PermanentEmployee();

        temp.greet();
        temp.showName();
        temp.showId();

        perm.showRollNumber();
        perm.showName();
        perm.showId();
    }
}

