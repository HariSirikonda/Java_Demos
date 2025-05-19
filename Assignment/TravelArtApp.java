package Assignment;

interface Trip {
    void planTrip();
}

interface Tour {
    void planTour();
}

interface Art {
    void createArt();
}

interface Paint {
    void paintCanvas();
}

class BasicActivities implements Trip, Tour, Art {
    public void planTrip() {
        System.out.println("Planning trip");
    }
    public void planTour() {
        System.out.println("Planning tour");
    }
    public void createArt() {
        System.out.println("Creating artwork");
    }
    public void listenMusic() {
        System.out.println("Listening to music");
    }
}

public class TravelArtApp extends BasicActivities implements Paint {
    public void paintCanvas() {
        System.out.println("Painting the canvas");
    }
    public void checkWeather() {
        System.out.println("Weather is cool");
    }

    public static void main(String[] args) {
        TravelArtApp app = new TravelArtApp();
        app.planTrip();
        app.planTour();
        app.createArt();
        app.listenMusic();
        app.paintCanvas();
        app.checkWeather();
    }
}
