import java.util.HashSet;

public class unique_numbers_in_array {
    public static void main(String[] args) {
        int [] arr = {5,4,6,8,8,5,9,0,1,6};
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
                hs.add(arr[i]);
        }

        for(int h: hs){
            System.out.println(h);
        }
    }
}
