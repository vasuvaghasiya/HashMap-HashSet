import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] arr = {1, 2, 3, 2, 1, 4, 5, 7, 6, 5, 7, 9};

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int oldF = hm.get(arr[i]);
                hm.put(arr[i], oldF + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for ( Map.Entry e : hm.entrySet()) {
            System.out.println("Element: " + e.getKey() + ", Frequency: " + e.getValue());
        }
    }
}
