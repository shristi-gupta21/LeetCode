import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length == nums2.length){
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums2[i]){
                    System.out.println(Arrays.toString(nums1));
                    return nums1;
                }
            }
        }
        int p1=0, p2=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                p1++;
            }else if(nums1[p1]>nums2[p2]){
                p2++;
            }else{
                arrayList.add(nums1[p1]);
                p1++;
                p2++;

            }
        }

//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums2[j] > nums1[i]){
//
//                }
//                else if (nums1[i] > nums2[j] ){
//
//                }
//                else{
//                    arrayList.add(nums1[i]);
//                }
//            }
//        }
//        System.out.println(arrayList);
        int[] arr = new int[arrayList.size() ];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersectionOfTwoArraysII.intersect(nums1,nums2);
    }
/* [4,9,5]
[9,4,9,8,4]*/
}
