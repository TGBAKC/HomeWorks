// Importing required classes
import java.util.HashMap;
import java.util.Map;

// Class name
public class MapEntry {

    // Main method – the starting point of the program
    public static void main(String[] args) {

        // Creating a HashMap where keys are Strings and values are Integers
        HashMap<String, Integer> scores = new HashMap<>();

        // Adding 5 key-value pairs to the map
        scores.put("tugba", 100);
        scores.put("faruk", 90);
        scores.put("filiz", 80);
        scores.put("elisa", 70);
        scores.put("rustem", 60);

        // Looping through each entry (key-value pair) in the map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            // entry.getKey() returns the key (name)
            // entry.getValue() returns the value (score)
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
