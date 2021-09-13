public class powOfThree {
    public boolean isPowOfThree(int n){
        int x = 1;
        if (n==0){
            return false;
        }
        while (n != 1){
            if (n % 3 != 0){
                return false;
            }
            n = n/3;
        }
        return true;
    }
}
