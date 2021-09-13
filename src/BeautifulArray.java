import java.util.ArrayList;

public class BeautifulArray {
    public int[] beautifulArray(int N){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        while (arrayList.size() < N){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int el : arrayList) {
                if (2*el - 1 <= N){
                    temp.add(el * 2 - 1);
                }
            }
            for (int el : arrayList){
                if (2*el <= N){
                    temp.add(el * 2);
                }
            }
            arrayList = temp;
        }
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
