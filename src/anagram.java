import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class anagram {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for(String word: words){
            res.add(word);
        }
        for(int i = 1; i < words.length; i++){
            if(isAnagram(words[i-1],words[i])){
                res.remove(words[i]);
            }
        }
        return res;
    }
    public boolean isAnagram(String word1, String word2){
        boolean flag = false;
        if(word1.length() == word2.length()){
            char[] word1arr = word1.toCharArray();
            char[] word2arr = word2.toCharArray();
            Arrays.sort(word1arr);
            Arrays.sort(word2arr);
            flag = Arrays.equals(word1arr,word2arr);

        }
        return flag;
    }

    public static void main(String[] args) {
        anagram anagram = new anagram();
        String[] arr = {"ab","ba"};
        System.out.println(anagram.removeAnagrams(arr));
    }
}

/*
* class CountIntervals {
    List<List<Integer>> list;
    Set<Integer> set;
    int count ;
    int j ;
    public CountIntervals() {
        list = new ArrayList<>();
        set = new HashSet<>();
        count = 0;
        j = 0;
    }

    public void add(int left, int right) {
        List<Integer> temp = new ArrayList<>();
        temp.add(left);
        temp.add(right);
        list.add(temp);

        for(int i = left; i<=right;i++){
            set.add(i);

        }



    }

    public int count() {
        count=0;
       for(int num : set){
            count++;
       }

        return count;
    }
}

/*class CountIntervals {
    List<List<Integer>> list;
    Set<Integer> set;
    int count ;
    int j ;
    public CountIntervals() {
        list = new ArrayList<>();
        set = new HashSet<>();
        count = 0;
        j = 0;
    }

    public void add(int left, int right) {
        List<Integer> temp = new ArrayList<>();
        temp.add(left);
        temp.add(right);
        list.add(temp);

        for(int i = left; i<=right;i++){
            set.add(i);

        }



    }

    public int count() {
        count=0;
       for(int num : set){
            count++;
       }

        return count;
    }
}

/**
 * Your CountIntervals object will be instantiated and called as such:
 * CountIntervals obj = new CountIntervals();
 * obj.add(left,right);
 * int param_2 = obj.count();
 */
