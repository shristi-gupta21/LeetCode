public class ImplementStrStr {
    public int strStr(String haystack, String needle) {

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        if (haystack.isEmpty() || needle.isEmpty() ){
            return 0;
        }
        if (needle.length() == 0){
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if( i + needle.length() > haystack.length()){
                return -1;
            }
            int m = i;
            for (int k = 0; k < needle.length(); k++) {
                if (chars2[k] == chars1[m]){
                    if (k == needle.length() - 1) {
                        return i;
                    }
                    m++;
                    //System.out.println(m);
                }
                else {
                    break;
                }
            }

//            if (chars1[i] == chars2[j]){
//                j++;
//                if (chars1[i] == chars2[j]){
//                    result += i + 1;
//                }
//            }

        }

        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println(implementStrStr.strStr("mississippi", "issip"));
    }
}
