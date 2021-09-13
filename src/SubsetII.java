import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return results;
        }

        Arrays.sort(nums);

        List<Integer> subset = new ArrayList<>();
        toFindAllSubsets(nums, results, subset, 0);

        return results;
    }

    private void toFindAllSubsets(int[] nums, List<List<Integer>> results,
                                  List<Integer> subset , int startIndex){
        results.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            if( i != startIndex && nums[i] == nums[i - 1]){
                continue;
            }

            subset.add(nums[i]);
            toFindAllSubsets(nums,results,subset,i+1);
            subset.remove(subset.size() - 1);
            System.out.println(subset);
        }
    }

    public static void main(String[] args) {
        SubsetII subsetII = new SubsetII();
        int[] nums = {1,2,3};
        System.out.println(subsetII.subsetsWithDup(nums));
    }
}
