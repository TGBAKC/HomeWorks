import java.util.HashMap;
import java.util.Map;





public class MapEntry {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("tugba", 100);
        scores.put("faruk", 90);
        scores.put("filiz", 80);
        scores.put("elisa", 70);
        scores.put("rustem", 60);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
