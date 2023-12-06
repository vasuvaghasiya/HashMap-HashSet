import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class two_array_are_equal_or_not {

    public static void main(String[] args) {
            int [] arr1= {1,2,2,3,4,5,5};
            int [] arr2= {1,2,3,3,4,5,5};

            if(arr1.length!=arr2.length){
                System.out.println("two array is not equal");
                return;
            }
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();


            for(int i=0;i<arr1.length;i++) {
                if(map.containsKey(arr1[i]))
                {
                    int oldF = map.get(arr1[i]);
                    map.put(arr1[i],oldF+1);
                }
                else{
                    map.put(arr1[i] , 1);
                }
                if(map2.containsKey(arr2[i])){
                    int oldF = map2.get(arr2[i]);
                    map2.put(arr2[i],oldF+1);
                }
                else{
                    map2.put(arr2[i] , 1);
                }
            }
            if(map.equals(map2)){
                System.out.println("equal");
            }
            else{
                System.out.println("not equal");
            }
//           for(Map.Entry e : map.entrySet())
//           {
//               int a = map2.get(e.getKey());
//               int b = map.get(e.getKey());
//               if(a!=b)
//               {
//                   System.out.println("arrays is not equal");
//                   return;
//               }
//           }
//            System.out.println("arrays is equal");

    }
}
