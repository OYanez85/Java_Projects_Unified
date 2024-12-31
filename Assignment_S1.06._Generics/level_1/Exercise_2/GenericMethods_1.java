import java.util.logging.Logger;

public class GenericMethods_1 {
    private static final Logger logger = Logger.getLogger(GenericMethods_1.class.getName());

    public <T, U, V> void print(T obj1, U obj2, V obj3) {
        logger.info(obj1 + " | " + obj2 + " | " + obj3);
    }

    public static void main(String[] args) {
        Persona person = new Persona("John", "Doe", 30);
        String text = "Sample Text";
        int number = 100;

        GenericMethods_1 gm = new GenericMethods_1();
        gm.print(person, text, number);
    }
}
