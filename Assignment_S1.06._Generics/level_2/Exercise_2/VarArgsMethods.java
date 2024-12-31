import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class VarArgsMethods {
    private static final Logger logger = Logger.getLogger(VarArgsMethods.class.getName());

    public VarArgsMethods() {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);  // Prevents duplicate log messages
    }

    // Generic method with variable arguments
    public <T> void print(T... args) {
        for (T arg : args) {
            logger.info(arg.toString());
        }
    }

    public static void main(String[] args) {
        Persona person = new Persona("Anna", "Smith", 25);
        String text = "Some text";
        int number = 42;

        VarArgsMethods vm = new VarArgsMethods();
        vm.print(person, text, number);
    }
}
