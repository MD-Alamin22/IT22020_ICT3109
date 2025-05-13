class Speaker extends SmartDevice implements VoiceControllable {
    Speaker(String name) {
        super(name);
    }

    void deviceType() {
        System.out.println(name + " is a Smart Speaker.");
    }

    public void respondToVoice(String command) {
        System.out.println("Voice Command: " + command);
    }
}
