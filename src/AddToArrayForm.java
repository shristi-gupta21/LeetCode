import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        } // Constructor
    }
    public void printList(List<Integer> list){
        Node n = head;
        while(n != null){
            System.out.println(n.data + " ");

        }
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new LinkedList<>();
        for(int i = num.length-1; i >=0;i--){
            result.add(0,(num[i]+k)%10);
            k = (num[i] + k) / 10;
        }
        while(k > 0){
            result.add(0,k%10);
            k = k/10;
        }
        return result;
    }

    public static void main(String[] args) {
        AddToArrayForm arrayForm = new AddToArrayForm();
        int[] arr = {1,2,5,4};
        List<Integer> newar = arrayForm.addToArrayForm(arr,20);
        arrayForm.printList(newar);

    }
}
