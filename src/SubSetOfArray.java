import java.util.HashSet;

public class SubSetOfArray {
    public static void main(String[] args) {
        int [] arr1 = {2,1,5,3,6,7,9};
        int [] arr2 = {2,5,9,0};
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!hs.contains(arr2[i])){
                System.out.println("not a subset");
                return;
            }
        }
        System.out.println("subset");

    }
}
