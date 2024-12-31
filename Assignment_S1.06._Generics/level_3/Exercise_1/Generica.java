public class Generica {
    public <T extends Telefon> void makeCall(T device) {
        device.call(); // This method should produce output
    }

    public <T extends Smartphone> void takePhoto(T device) {
        device.takePhoto(); // This method should produce output
    }
}
