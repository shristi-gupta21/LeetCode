import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoneGame {
    public boolean stoneGame(int[] piles){
//        int[] dp = Arrays.copyOf(piles,piles.length);
//        for (int i = 1; i < piles.length; i++) {
//            for (int j = 0; j < piles.length - i; j++) {
//                dp[i] = Math.max(piles[j] - dp[j+1], piles[i+j] - dp[j]);
//            }
//        }
//        return dp[0] > 0;


            int cnt1=0,cnt2=0;
            for(int i=0;i<piles.length;i++){
                if(i%2==0){cnt1+=piles[i];System.out.println(cnt1);}
                else cnt2+=piles[i];
                System.out.println(cnt2);
            }
            int sum=0;
            if(cnt1>cnt2){
                for(int i=0;i<piles.length;i++)
                    sum+=piles[i%2];
                System.out.println(sum);
                return true;
            }else
            {
                for(int i=piles.length-1;i>=0;i--)
                    sum+=piles[i%2+1];
                return true;
            }



//        List<Integer> alex = new ArrayList<>();
//        List<Integer> lee = new ArrayList<>();
//        //transfer(piles);
//
//        for (int i = 0; i < piles.length; i++) {
//            if (piles[i] > piles[i+piles.length]){
//                alex.add(piles[i]);
//            }if (piles[i+ piles.length] > piles[i]){
//                alex.add(piles[i+ piles.length]);
//            }
//
//        }


    }
//    private void transfer(int[] piles){
//        List<Integer> piles2 = new ArrayList<>();
//        for (int i = 0; i < piles.length; i++) {
//            piles2.add(piles[i]);
//        }
//    }

    public static void main(String[] args) {
        StoneGame stoneGame = new StoneGame();
        int[] nums = {5,3,4,5,10,1};
        System.out.println(stoneGame.stoneGame(nums));
    }
}
