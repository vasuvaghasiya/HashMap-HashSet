import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int [] arr1 = {16,2,3,1,7,9,2};
        int pariSum = 16;

        findPairSum(arr1,pariSum);
    }

    private static void findPairSum(int[] arr, int sum) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i : arr){
            int d = sum-i;
            if(hs.contains(d)){
                System.out.println("pair sum is exixts");
                return;
            }
            hs.add(i);
        }
        System.out.println("pair sum is not present");

    }
}
