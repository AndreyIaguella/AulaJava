import java.util.HashMap;
import java.util.Map;

public class MainMain {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "joão");
        map.put(2, "Anna");
        map.put(3, "Maria");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
