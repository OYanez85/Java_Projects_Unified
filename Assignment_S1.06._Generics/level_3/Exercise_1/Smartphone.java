public class Smartphone implements Telefon {
    @Override
    public void call() {
        System.out.println("Making a call...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
}
