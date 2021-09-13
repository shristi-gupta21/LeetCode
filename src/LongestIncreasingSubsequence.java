//1. If A[i] is smallest among all end
//        candidates of active lists, we will start
//        new active list of length 1.
//
//
//        2. If A[i] is largest among all end candidates of
//        active lists, we will clone the largest active
//        list, and extend it by A[i].
//
//
//        3. If A[i] is in between, we will find a list with
//        largest end element that is smaller than A[i].
//        Clone and extend this list by A[i]. We will discard all
//        other lists of same length as that of this modified list.


public class LongestIncreasingSubsequence {
    static int CeilIndex(int nums[], int l, int r, int key)
            //binarySearch
    {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (nums[m] >= key)
                r = m;
            else
                l = m;
        }

        return r;
    }
    public int lengthOfLIS(int[] nums) {
        int[] tailTable = new int[nums.length];
        int len;

        tailTable[0] = nums[0];
        len = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < tailTable[0]) {
                tailTable[0] = nums[i];
            }
            else if (nums[i] > tailTable[len - 1]){
                tailTable[len++] = nums[i];
            }
            else {
                tailTable[CeilIndex(tailTable,-1,len -1 , nums[i])] = nums[i];
            }
        }
        return len;
    }
}
