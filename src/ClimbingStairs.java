import java.lang.reflect.Array;
import java.util.Arrays;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int t[] = new int[n+1];
        t[0] = 1;
        t[1] = 1;

        for(int i = 2; i < t.length; i++){
            t[i] = t[i-1] + t[i-2];
            System.out.println("i= " + i + " = " + t[i]);
        }
        return t[n];
    }

    public static void main(String[] args) {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(4));
    }
}
