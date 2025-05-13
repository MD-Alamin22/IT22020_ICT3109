abstract class SmartDevice {
    String name;

    SmartDevice(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is ON.");
    }

    void turnOff() {
        System.out.println(name + " is OFF.");
    }

    abstract void deviceType();
}
