import java.util.Arrays;
import java.util.Collections;

class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveLinkedListElements {
    ListNode head;

    public void pushElements(int data){
        ListNode listNode = new ListNode(data);
        listNode.next = head;
        head = listNode;
    }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }
        if (head.val == val) {
            return removeElements(head.next,val);
        }
        head.next = removeElements(head.next,val);
        return head;

//        ListNode helper = new ListNode(0);
//        helper.next = head;
//        ListNode p = helper;
//
//        while(p.next != null){
//            if(p.next.val == val){
//                ListNode next = p.next;
//                p.next = next.next;
//            }else{
//                p = p.next;
//            }
//        }
//
//        return helper.next;
    }

    public void printList(){
        ListNode tNode = head;
        while (tNode != null){
            System.out.print(tNode.val + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        RemoveLinkedListElements list = new RemoveLinkedListElements();
        list.pushElements(5);
        list.pushElements(6);
        list.removeElements(list.head,6);

//        list.printList();

    }
}
