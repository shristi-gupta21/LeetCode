import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    ListNode head;
    static int carry = 0;
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode prev  = null;
        int j = 0;
        while(l1!=null && l2!=null){
            int data = l1.val+l2.val+carry;
            carry = data/10;
            ListNode newNode = new ListNode(data%10);
            if(j == 0){
                head = newNode;
                prev = head;
                j++;
            }
            else{
                prev.next = newNode;
                prev = newNode;
            }

            l1 = l1.next;
            l2 = l2.next;

        }
        if(l1 == null && l2!=null){
            while(l2!=null){
                int data = l2.val+carry;
                carry = data/10;
                ListNode newNode = new ListNode(data%10);
                prev.next = newNode;
                prev = newNode;
                l2 = l2.next;

            }
        }
        else if(l1!=null && l2 == null){
            while(l1!=null){
                int data = l1.val+carry;
                carry = data/10;
                ListNode newNode = new ListNode(data%10);
                prev.next = newNode;
                prev = newNode;
                l1 = l1.next;

            }
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            prev.next = newNode;
            prev = newNode;
        }
        prev.next = null;
        return head;
    }
}
