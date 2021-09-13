public class Candy {
    public int candy(int[] ratings){
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            //for (int j = i; j < ratings.length; j++) {
                if (ratings[ratings.length-1] < ratings[i]){
                    sum+=2;
                }
                else {
                    sum+=1;
                    System.out.println(sum);
                }
            //}
        }
        return sum;
    }

    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] arr = new int[]{1,0,2};
        System.out.println(candy.candy(arr));
    }
}
