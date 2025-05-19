package Kp_Assignment;

interface Vegetables {
    void listVegetables();
}
interface Fruits {
    void listFruits();
}
class Stock {
    void leafyVegetables() {
        System.out.println("Leafy vegetables: Lettuce, Kale, Spinach");
    }
}
class Store extends Stock implements Vegetables, Fruits {
    public void listVegetables() {
        System.out.println("Vegetables available: Tomato, Potato, Carrot");
    }
    public void listFruits() {
        System.out.println("Fruits available: Apple, Banana, Orange");
    }
    public void healthyOptions() {
        System.out.println("Healthy options: Broccoli, Sweet potato, Berries");
    }
}
class StoreInfo extends Store {
    public void monthlyCost() {
        System.out.println("Monthly cost estimate: $300");
    }
}
public class GroceryDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Store store = new Store();
        StoreInfo info = new StoreInfo();
        store.healthyOptions();
        store.leafyVegetables();
        store.listVegetables();
        store.listFruits();
        stock.leafyVegetables();
        info.monthlyCost();
        info.healthyOptions();
    }
}

