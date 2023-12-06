import java.util.HashMap;
import java.util.Map;

public class MostFrequentElemenetInArray {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,2,3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxElement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
            {
                int oldF = map.get(arr[i]);
                map.put(arr[i],oldF+1);
            }
            else{
                map.put(arr[i],1);
            }
            if(max<map.get(arr[i]))
            {
                max = map.get(arr[i]);
                maxElement=arr[i];
            }
        }

        System.out.println(maxElement+":"+max);
    }
}
