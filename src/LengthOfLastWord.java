import java.util.ArrayList;

public class LengthOfLastWord {
    public int lengthOfLastWord(final String s) {
        boolean char_flag = false;
        int len = 0;
        for (int i = s.length()-1 ; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i))){
                char_flag = true;
                len++;
            }
            else {
                if (char_flag == true){
                    return len;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LengthOfLastWord length = new LengthOfLastWord();
        String strings ="Hello World       ";
        System.out.println(length.lengthOfLastWord(strings));
    }
}
