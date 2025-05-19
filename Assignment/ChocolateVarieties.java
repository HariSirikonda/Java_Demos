package Assignment;

interface DarkChocolate {
    void describeKitKat();
}

interface WhiteChocolate {
    void describeMilkyBar();
}

class DairyMilk {
    void describe() {
        System.out.println("Dairy Milk is sweet and creamy");
    }
}

class ChocolateBrands extends DairyMilk implements DarkChocolate, WhiteChocolate {
    public void describeKitKat() {
        System.out.println("KitKat is a crispy chocolate");
    }
    public void describeMilkyBar() {
        System.out.println("MilkyBar is white chocolate");
    }
    public void describeBournville() {
        System.out.println("Bournville is rich dark chocolate");
    }
}

class SpecialChocolate extends ChocolateBrands {
    public void describeKisses() {
        System.out.println("Kisses chocolate is smooth and sweet");
    }

    public static void main(String[] args) {
        SpecialChocolate choc = new SpecialChocolate();
        choc.describeBournville();
        choc.describeKitKat();
        choc.describeMilkyBar();
        choc.describeKisses();
    }
}
