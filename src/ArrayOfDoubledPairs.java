import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOfDoubledPairs {
    //[-4,-2,2,4]
    public boolean canReorderDoubled(int[] arr) {
       // Arrays.sort(arr);
        int count  = 0;
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[2 * i + 1] ==  2 * arr[2 * i] ){
                System.out.println("i = " + i );
                ++count;
                System.out.println(count);
                //return true;
            }
            //return true;

            else {
                System.out.println(i);
                //break;
                //return false;
            }
        }

        if (count == arr.length/2){
            return true;
        }
        return false;
    }

    /*
    * lass Solution {
    public boolean canReorderDoubled(int[] arr) {
        if(arr==null || arr.length==0)return true;
       int max=Integer.MIN_VALUE;
        for(int i:arr)max=Math.max(max,Math.abs(i));

        int[] pos=new int[max+1];
        int[] neg=new int[max+1];
        for(int i:arr){
            if(i>=0){
                pos[i]++;
            }else{
                neg[Math.abs(i)]++;
            }
        }

        for(int i=0;i<=max;i++){
            if(pos[i]>0){
                if(2*i>=pos.length || pos[2*i]<pos[i])return false;

                pos[2*i]-=pos[i];
            }

            if(neg[i]>0){
                if(2*i>=pos.length || neg[2*i]<neg[i])return false;

                neg[2*i]-=neg[i];
            }
        }

        return true;
    }
}*/

    public static void main(String[] args) {
        ArrayOfDoubledPairs arrayOfDoubledPairs = new ArrayOfDoubledPairs();
        int[] arr = {4,-2,2,-4};
        System.out.println(arrayOfDoubledPairs.canReorderDoubled(arr));
    }
}
