import java.util.*;
import java.util.Map.Entry;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int list = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                    map.put(nums[i],c);
//                    System.out.print(nums[i] + "\t");
//                    System.out.println(c);
                }
            }
//             c =0;

//            System.out.println(map.get(nums[i]));
        }
        for (Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue().equals(c) ){

                return entry.getKey();
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,2,2,1,1,1};
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(nums));
    }

}