interface Vehicle1 {
    void start();
}

class Car implements Vehicle1 {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
