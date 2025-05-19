package Kp_Assignment;

interface PowerOn {
    void powerOn();
}
interface PowerOff {
    void powerOff();
}
interface DeviceControl {
    void reset();
}
public class RemoteControl implements PowerOn, PowerOff, DeviceControl {
    public void powerOn() {
        System.out.println("Device powered on");
    }
    public void powerOff() {
        System.out.println("Device powered off");
    }
    public void reset() {
        System.out.println("Device reset");
    }
    public void sleep() {
        System.out.println("Device in sleep mode");
    }
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();
        rc.powerOn();
        rc.powerOff();
        rc.reset();
        rc.sleep();
    }
}
