import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public int k = 0;
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target-nums[i]){
                    //[k] = i;
                    //k+=i;
                    arrayList.add(j);
                    arrayList.add(i);
                    System.out.println(j);
                    System.out.println(i);
                }
            }
        }
        //throw new IllegalArgumentException("No two sum Solution");
        int[] result = new int[2];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] num = {5,10,6};
        String s = Arrays.toString(twoSum.twoSum(num, 15));
        System.out.println(s);
    }
}
