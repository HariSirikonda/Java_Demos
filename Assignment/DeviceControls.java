package Assignment;

interface GetAction {
    void get();
}

interface SetAction {
    void set();
}

interface GoAction {
    void go();
}

public class DeviceControls implements GetAction, SetAction, GoAction {
    public void get() {
        System.out.println("Get action executed");
    }
    public void set() {
        System.out.println("Set action executed");
    }
    public void go() {
        System.out.println("Go action executed");
    }
    public void finish() {
        System.out.println("Finish action executed");
    }

    public static void main(String[] args) {
        DeviceControls device = new DeviceControls();
        device.get();
        device.set();
        device.go();
        device.finish();
    }
}

