package Kp_Assignment;

interface StreamingService {
    void stream();
}
class Content {
    public void like() {
        System.out.println("Content liked");
    }
}
class YouTube extends Content implements StreamingService {
    public void share() {
        System.out.println("Content shared on YouTube");
    }
    public void stream() {
        System.out.println("Streaming on YouTube");
    }
}
class YouTubePremium extends YouTube {
    public void accessPremium() {
        System.out.println("Accessing premium features");
    }
}
public class MediaDemo {
    public static void main(String[] args) {
        YouTube yt = new YouTube();
        YouTubePremium premium = new YouTubePremium();
        premium.stream();
        premium.accessPremium();
        premium.share();
        yt.like();
    }
}
