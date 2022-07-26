import java.util.Map;

public class Main {
    public static void main(String[] args) {
        KeyValueReader kvr = new KeyValueReader();
        for(Map.Entry<String, String> entry : kvr.readFromFile().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
