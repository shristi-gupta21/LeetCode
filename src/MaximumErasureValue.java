import java.util.Arrays;

public class MaximumErasureValue {
    public int[] maximumUniqueSubarray(int[] nums) {
        int[] arr = nums;


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (nums[j] != arr[k]){
                        nums[j] = arr[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return arr;
    }

    public static void main(String[] args) {
        MaximumErasureValue maximumErasureValue = new MaximumErasureValue();
        System.out.println(maximumErasureValue.maximumUniqueSubarray(new int[]{1, 1, 2, 5}));
    }
}
