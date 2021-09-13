import java.util.Arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int num,reverse = 0, remainder;
        num = x;
       while (x > 0){
           remainder = x % 10;
           reverse = (reverse * 10) + remainder;
           x = x/10;
       }
       if (num == reverse){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-121));
    }
}
