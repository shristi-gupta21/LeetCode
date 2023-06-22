import java.util.Arrays;

class HappyNumber {
    public boolean isPalindrome(String s) {
        String[] arrOfStr = s.split("[, :]+");
        System.out.println(Arrays.toString(arrOfStr));
        String str = "";
        for(String st: arrOfStr){
            str+=st;

        }
        String newStr = str.toLowerCase();
        System.out.println(newStr);
        int end = newStr.length()-1;
        char[] charArr = newStr.toCharArray();
        int start = 0;
        while(start < end){
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;end--;

        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber number = new HappyNumber();
        System.out.println(number.isPalindrome(
                "A man, a plan, a canal: Panama"));
    }
}