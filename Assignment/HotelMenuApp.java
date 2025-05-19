package Assignment;

interface TiffinService {
    void showTiffins();
}

interface MealService {
    void showMeals();
}

interface DrinkService {
    void showDrinks();
}

class DessertMenu implements TiffinService, MealService, DrinkService {
    public void showDesserts() {
        System.out.println("Desserts: Gulab Jamun, Rasmalai, Junnu");
    }
    public void showTiffins() {
        System.out.println("Tiffins: Dosa, Idli, Poori, Vada");
    }
    public void showMeals() {
        System.out.println("Meals: Rice, Sambar, Papad, Chutney, Curd");
    }
    public void showDrinks() {
        System.out.println("Drinks: Soft drinks, Milkshakes, Juices");
    }
}

interface Hotel {
    void showHotelName();
}

class HotelMenu extends DessertMenu implements Hotel {
    public void showMenuTitle() {
        System.out.println("Menu Details:");
    }
    public void showHotelName() {
        System.out.println("Hotel Name: Taaza ORDER MESS");
    }
}

public class HotelMenuApp {
    public static void main(String[] args) {
        HotelMenu menu = new HotelMenu();
        DessertMenu dessert = new DessertMenu();

        menu.showHotelName();
        menu.showMenuTitle();

        dessert.showMeals();
        dessert.showTiffins();
        dessert.showDrinks();
        dessert.showDesserts();
    }
}
