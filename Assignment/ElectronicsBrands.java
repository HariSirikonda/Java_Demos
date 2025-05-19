package Assignment;

interface Refrigerator {
    void showRefrigeratorBrands();
}

class Television {
    public void showTVBrands() {
        System.out.println("TV Brands: TCL, SONY, SAMSUNG");
    }
}

class Accessories extends Television implements Refrigerator {
    public void showWatchBrands() {
        System.out.println("Watch Brands: Fastrack, Casio, Fossil");
    }
    public void showRefrigeratorBrands() {
        System.out.println("Refrigerator Brands: LG, Samsung, Haier");
    }
}

class Tablets {
    public void showTabletBrands() {
        System.out.println("Tablet Brands: Apple, Samsung, Google");
    }
}

class AudioAccessories extends Tablets {
    public void showEarbudsBrands() {
        System.out.println("Earbuds Brands: Apple, Boat, Boult");
    }
}

public class ElectronicsBrands {
    public static void main(String[] args) {
        Television tv = new Television();
        Accessories accessories = new Accessories();
        Tablets tablets = new Tablets();
        AudioAccessories audio = new AudioAccessories();

        tv.showTVBrands();
        accessories.showRefrigeratorBrands();
        accessories.showWatchBrands();
        accessories.showTVBrands();
        tablets.showTabletBrands();
        audio.showTabletBrands();
        audio.showEarbudsBrands();
    }
}

