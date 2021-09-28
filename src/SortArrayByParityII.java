import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] result = new int[nums.length];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                result[i] = even.get((int) Math.ceil(j/2));
                System.out.println("even");
                System.out.println((int) Math.ceil(j/2));
                j++;
            }
            else{
                result[i] = odd.get((int) Math.ceil(j/2));
                System.out.println("odd");
                System.out.println((int) Math.ceil(j/2));
                j++;
            }
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        SortArrayByParityII array = new SortArrayByParityII();
        int[] arr = {4,2,5,7};
        System.out.println(array.sortArrayByParityII(arr));
    }
}
