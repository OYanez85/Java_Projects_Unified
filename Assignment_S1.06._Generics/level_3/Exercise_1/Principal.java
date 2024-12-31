public class Principal {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generica generica = new Generica();

        generica.makeCall(smartphone);  // Should call Telefon's method to make a call
        generica.takePhoto(smartphone); // Should call Smartphone's method to take a photo
    }
}
