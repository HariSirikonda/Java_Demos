package Kp_Assignment;

interface Refrigerator {
    void getTypes();
}
class Electronics {
    public void listTVBrands() {
        System.out.println("TV brands: Sony, LG, Panasonic");
    }
}
class ApplianceStore extends Electronics implements Refrigerator {
    public void listWatchBrands() {
        System.out.println("Watch brands: Fossil, Seiko, Citizen");
    }
    public void getTypes() {
        System.out.println("Refrigerator types: French Door, Side-by-Side, Mini");
    }
}
class MobileDevices {
    public void listTabletBrands() {
        System.out.println("Tablet brands: Apple, Samsung, Amazon");
    }
}
class Accessories extends MobileDevices {
    public void listEarbudsBrands() {
        System.out.println("Earbuds brands: Apple, Bose, Jabra");
    }
}
public class ApplianceDemo {
    public static void main(String[] args) {
        Electronics elec = new Electronics();
        ApplianceStore store = new ApplianceStore();
        MobileDevices mobile = new MobileDevices();
        Accessories acc = new Accessories();
        elec.listTVBrands();
        store.getTypes();
        store.listWatchBrands();
        store.listTVBrands();
        mobile.listTabletBrands();
        acc.listTabletBrands();
        acc.listEarbudsBrands();
    }
}

