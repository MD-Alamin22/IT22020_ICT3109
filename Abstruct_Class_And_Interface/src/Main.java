public class Main {
    public static void main(String[] args) {
        Light light = new Light("Philips Light");
        Speaker speaker = new Speaker("Amazon Echo");

        light.turnOn();
        light.deviceType();
        light.turnOff();

        System.out.println();

        speaker.turnOn();
        speaker.deviceType();
        speaker.respondToVoice("Play music");
        speaker.turnOff();
    }
}
