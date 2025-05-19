package Kp_Assignment;

interface Travel {
    void planTrip();
}
interface Sightseeing {
    void exploreTour();
}
interface Creativity {
    void createArt();
}
interface Painting {
    void doPainting();
}
class BasicTour implements Travel, Sightseeing, Creativity {
    public void planTrip() {
        System.out.println("Planning trip itinerary");
    }
    public void exploreTour() {
        System.out.println("Exploring tourist spots");
    }
    public void createArt() {
        System.out.println("Creating travel sketches");
    }
    public void listenToMusic() {
        System.out.println("Listening to local music");
    }
}
public class AdvancedTour extends BasicTour implements Painting {
    public void doPainting() {
        System.out.println("Painting local scenery");
    }
    public void checkWeather() {
        System.out.println("Weather is sunny");
    }
    public static void main(String[] args) {
        AdvancedTour tour = new AdvancedTour();
        tour.planTrip();
        tour.exploreTour();
        tour.createArt();
        tour.listenToMusic();
        tour.doPainting();
        tour.checkWeather();
    }
}

