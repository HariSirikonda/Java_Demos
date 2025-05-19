package Kp_Assignment;

interface Snacks {
    void listSnacks();
}
interface MainCourse {
    void listMainCourse();
}
interface Beverages {
    void listBeverages();
}
class Dessert implements Snacks, MainCourse, Beverages {
    public void listDesserts() {
        System.out.println("Desserts: Cheesecake, Brownies, Ice Cream");
    }
    public void listSnacks() {
        System.out.println("Snacks: Samosa, Spring Roll, Pakora");
    }
    public void listMainCourse() {
        System.out.println("Main course: Biryani, Paneer Butter Masala, Dal Makhani");
    }
    public void listBeverages() {
        System.out.println("Beverages: Tea, Coffee, Soft Drinks");
    }
}
interface Restaurant {
    void getRestaurantName();
}
class Menu extends Dessert implements Restaurant {
    public void showMenu() {
        System.out.println("Full Menu Details");
    }
    public void getRestaurantName() {
        System.out.println("Restaurant: Spice Villa");
    }
}
public class RestaurantDemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dessert dessert = new Dessert();
        menu.getRestaurantName();
        menu.showMenu();
        dessert.listMainCourse();
        dessert.listSnacks();
        dessert.listBeverages();
        dessert.listDesserts();
    }
}

