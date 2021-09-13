public class PeakNumber {
    public int findPeakElement(int[] nums) {
        int result = 0;
        //int[] arr = new int[1000];
        if (nums.length == 1){
            return 0;
        }
        if (nums[0] >= nums[1]){
            return 0;
        }
        if (nums[nums.length-1] >= nums[nums.length-2]){
            return nums.length-1;
        }
        for (int i = 1; i < nums.length-1; i++) {

            if (nums[i] != nums[i+1]){
                if (nums[i] >= nums[i+1] && nums[i-1] <= nums[i]){
                    //result = Math.max(result,i);
                    return i;
                    //System.out.println();
                }
                System.out.println(i);
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        PeakNumber peakNumber = new PeakNumber();
        int[] nums = {1,2,1,3,5,6,4};
        peakNumber.findPeakElement(nums);
    }
}
