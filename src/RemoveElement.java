public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int temp[] = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }

        }
     return j;
    }
}
