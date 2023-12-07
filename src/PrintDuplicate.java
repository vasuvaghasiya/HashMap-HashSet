import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) {
                int oldF = map.get(arr[i])+1;
                map.put(arr[i],oldF);
            }
            else{
                map.put(arr[i] ,1);
            }
            if(map.get(arr[i])==2)
            {
                System.out.println(arr[i]);
            }
        }
//        for (Map.Entry e : map.entrySet())
//        {
//            if(Integer.parseInt(e.getValue().toString())>1){
//                System.out.println(e.getKey());
//            }
//        }
    }
}
