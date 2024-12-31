import java.util.logging.Logger;

public class GenericMethodsModified {
    private static final Logger logger = Logger.getLogger(GenericMethodsModified.class.getName());

    public <T, U, V> void print(T obj1, U obj2, V obj3) {
        logger.info(obj1 + " | " + obj2 + " | " + obj3);
    }

    public static void main(String[] args) {
        Persona person = new Persona("Jane", "Doe", 28);
        String text = "Another Text";
        int number = 150;

        GenericMethodsModified gm = new GenericMethodsModified();
        gm.print(person, text, number);
    }
}
