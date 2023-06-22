public class AddBinary {
    public String addBinary(String a, String b) {

            int alength = a.length();
            int blength = b.length();
            String result = "";
            int i = 0;
            int carry = 0;
            while(i < alength || i < blength || carry != 0){
                int x = 0;
                if( i < alength && a.charAt(alength-i-1) == '1'){
                    x = 1;
                }
                int y = 0;
                if( i < blength && b.charAt(blength-1-i) == '1'){
                    y = 1;
                }
                result = (x+y+carry)%2+result;
                carry = (x+y+carry)/2;
                i++;
            }
            return result; }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11", "1"));
    }
}
