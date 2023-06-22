import java.util.Arrays;

class SummaryRanges {
    public String[] findRestaurant(String[] list1, String[] list2) {
        String[] ans = new String[1];
        for(int i = 0; i< list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i] == list2[j]){
                    ans[0] = list1[i];

                        break;
                }
                System.out.println(Arrays.toString(ans));
                break;


            }

        }
        return ans;
    }

    public static void main(String[] args) {
        SummaryRanges sm = new SummaryRanges();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] ans = sm.findRestaurant(list1,list2);
        System.out.println(Arrays.toString(ans));
    }
}