import java.util.HashMap;
import java.util.Map;

/*Strings, Numbers, and Math
Problem Statement : Counting Duplicate Characters
Write a program that counts duplicate characters from a given String.

Sample Input 1
"aabcc"
Sample Output 1
{a=2, b=1, c=2}*/
public class CountingDuplicateNumbers {
    public void findDuplicate(String str){
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.print(map);


    }

    public static void main(String[] args) {
        CountingDuplicateNumbers countingDuplicateNumbers = new CountingDuplicateNumbers();
        countingDuplicateNumbers.findDuplicate("aabcc");
    }
}
