import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

public class JsonSerializer {
    public static void serialize(Object object) throws IOException {
        Class<?> objClass = object.getClass();
        if (objClass.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = objClass.getAnnotation(JsonSerializable.class);
            String directory = annotation.directory();
            JSONObject jsonObject = new JSONObject(object);

            try (FileWriter file = new FileWriter(directory + "/output.json")) {
                file.write(jsonObject.toString());
                System.out.println("JSON file created: " + directory + "/output.json");
            }
        } else {
            throw new RuntimeException("Class is not annotated with @JsonSerializable.");
        }
    }
}
