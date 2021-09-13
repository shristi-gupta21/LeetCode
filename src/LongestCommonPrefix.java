import java.util.StringTokenizer;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int strlength = strs.length;
        String result = "";
        if (strlength == 0){
            return result;
        }
        String prefix = strs[0];
        for (int i = 1; i < strlength; i++) {
            //int num = Integer.min(strs[i-1].length(),strs[i].length());
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()){
                    return result;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = {"flower","flow","flowing"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
    }
}
