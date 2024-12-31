import java.io.IOException;
public class MainClass {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try {
            JsonSerializer.serialize(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
