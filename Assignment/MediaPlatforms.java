package Assignment;

interface OnlinePlatform {
    void streamContent();
}

class Shorts {
    public void displayLikes() {
        System.out.println("Trending shorts: Yoga shorts");
    }
}

class Instagram extends Shorts implements OnlinePlatform {
    public void shareContent() {
        System.out.println("Sharing via WhatsApp");
    }
    public void streamContent() {
        System.out.println("Streaming videos on Instagram platform");
    }
}

class HomeScreen extends Instagram {
    public void showNotificationMenu() {
        System.out.println("Notification Bell Icon Displayed");
    }
}

public class MediaPlatforms {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        HomeScreen home = new HomeScreen();

        home.streamContent();
        home.showNotificationMenu();
        home.shareContent();
        insta.displayLikes();
    }
}

