package Assignment;

interface VegetableList {
    void showVegetables();
}

interface FruitList {
    void showFruits();
}

class LeafyVegetables {
    void displayLeafyVegetables() {
        System.out.println("Leafy vegetables: Spinach, Mint, Palak");
    }
}

class HealthyFood extends LeafyVegetables implements VegetableList, FruitList {
    public void showVegetables() {
        System.out.println("Vegetables: Tomato, Potato, Bottle Gourd");
    }
    public void showFruits() {
        System.out.println("Fruits: Mango, Apple, Banana");
    }
    public void displayHealthyOptions() {
        System.out.println("Healthy options: Carrot, Beetroot, Broccoli");
    }
}

class MonthlyCost extends HealthyFood {
    public void displayMonthlyCost() {
        System.out.println("Estimated monthly cost: 1500");
    }
}

public class HealthyFoods {
    public static void main(String[] args) {
        LeafyVegetables leafy = new LeafyVegetables();
        HealthyFood healthy = new HealthyFood();
        MonthlyCost cost = new MonthlyCost();

        healthy.displayHealthyOptions();
        healthy.displayLeafyVegetables();
        healthy.showVegetables();
        healthy.showFruits();
        leafy.displayLeafyVegetables();
        cost.displayMonthlyCost();
        cost.displayHealthyOptions();
    }
}

