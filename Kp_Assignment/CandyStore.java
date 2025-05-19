package Kp_Assignment;

interface DarkChocolate {
    void darkFlavor();
}
interface WhiteChocolate {
    void whiteFlavor();
}
class BasicChocolate {
    void classicTaste() {
        System.out.println("Classic milk chocolate taste");
    }
}
class PremiumChocolate extends BasicChocolate implements DarkChocolate, WhiteChocolate {
    public void darkFlavor() {
        System.out.println("Rich dark chocolate flavor");
    }
    public void whiteFlavor() {
        System.out.println("Creamy white chocolate flavor");
    }
    public void specialEdition() {
        System.out.println("Special edition chocolates available");
    }
}
class DeluxeChocolate extends PremiumChocolate {
    public void giftPack() {
        System.out.println("Deluxe gift pack chocolates");
    }
    public static void main(String[] args) {
        DeluxeChocolate choco = new DeluxeChocolate();
        choco.specialEdition();
        choco.darkFlavor();
        choco.whiteFlavor();
        choco.giftPack();
    }
}

