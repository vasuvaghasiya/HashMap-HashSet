import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method

        map.put("vasu", 10);
        map.put("sneh", 20);
        map.put("darsan", 30);


        // Print size of Map
        System.out.println("Size of map is:- " + map.size());


        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if
        // present than return true, print value by passing element
        if (map.containsKey("vasu")) {

            // Mapping
            Integer a = map.get("vasu");

            // Printing value for the corresponding key
            System.out.println("value for key vasu is " + a);

        }else{
            System.out.println("not presenet key");
        }

        map.remove("vasu");//Removes the mapping for the specified key from this map if present.
        System.out.println(map);
        System.out.println(map.clone());
        System.out.println(map.values());//Returns a Collection view of the values contained in this map.
        System.out.println(map.hashCode());//Returns the hash code value for this map.
    }
}
