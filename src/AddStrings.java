public class AddStrings {
    public String addStrings(String num1, String num2) {
        String result = "";
        int sum = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        while(i >= 0 && j >= 0 ){
           int ival =num1.charAt(i - '0') ;
           int jval = num2.charAt(j - '0' ) ;
           sum = ival + jval + carry;
           carry = sum / 10;
           sum = sum % 10;
           result = sum + result;
           i--;
           j--;

        }
        while (i >= 0){
            int ival = num1.charAt(i) - '0';
            sum = ival + carry;
            carry = sum/10;
            sum = sum % 10;

            result = sum + result;

            i--;
        }

        while (j >= 0){
            int jval = num2.charAt(j) - '0';
            sum = jval + carry;
            carry = sum/10;
            sum = sum % 10;

            result = sum + result;

            j--;
        }

        if (carry == 1){
            result = "1" + result;
        }
        return result;

    }

    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        System.out.println(addStrings.addStrings("1155", "544"));
    }
}
