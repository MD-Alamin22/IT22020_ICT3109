class Light extends SmartDevice {
    Light(String name) {
        super(name);
    }

    void deviceType() {
        System.out.println(name + " is a Smart Light.");
    }
}
