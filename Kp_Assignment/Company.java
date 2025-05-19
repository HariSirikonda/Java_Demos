package Kp_Assignment;

interface Person {
    void getName();
}
interface EmployeeId extends Person {
    void getId();
}
class Intern implements Person {
    public void getName() {
        System.out.println("Name: Rahul");
    }
}
class Manager implements EmployeeId {
    public void getName() {
        System.out.println("Name: Priya");
    }
    public void getId() {
        System.out.println("Employee ID: M102");
    }
    public void getDepartment() {
        System.out.println("Department: Sales");
    }
}
public class Company {
    public static void main(String[] args) {
        Intern intern = new Intern();
        Manager manager = new Manager();
        intern.getName();
        manager.getName();
        manager.getId();
        manager.getDepartment();
    }
}

