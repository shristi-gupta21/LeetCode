import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i] ){
                return true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
