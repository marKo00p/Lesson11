import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class KeyValueReader {
    private final String KeyValue = "src/KeyValue";
    public Map<String,String> readFromFile() {

        HashMap<String, String> regionCodes = new HashMap<>();
        String line;
        try (BufferedReader bis = new BufferedReader(new FileReader(KeyValue))) {
            while((line = bis.readLine()) != null){
                String[] keyValuePair = line.split(",");
                if(keyValuePair.length > 1) {

                            String key = keyValuePair[0];
                            String value = keyValuePair[1];

                            if (!key.equals("") && !value.equals("")) {  //put key and value in HashMap if they aren't empty
                                regionCodes.put(key, value);
                            }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return regionCodes;
    }
}
