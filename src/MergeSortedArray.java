import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1length = m+n;
        int j = 0;
        if (nums2.length == 0){
            System.out.println(Arrays.toString(nums1));
        }
        else if(m == 0 && n==1){
            nums1[0] = nums1[0] + nums2[0];
            System.out.println(Arrays.toString(nums1));
        }else{
            for (int i = m; i < nums1length ; i++) {
                nums1[i] = nums1[i] + nums2[j];
                j++;
            }

            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }

    }
            

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {};
        mergeSortedArray.merge(nums1,1,nums2,0);

    }
}
