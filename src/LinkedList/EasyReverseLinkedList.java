package LinkedList;

import java.util.List;

/**
 * Created by fyang on 10/14/2015.
 */


public class EasyReverseLinkedList {

    public static ListNode  reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=new ListNode();

        while(cur!=null)
        {
            //move next, keep cur.next
            next=cur.next;
            //reverse
            cur.next=prev;
            //move prev
            prev=cur;
            //move cur
            cur=next;
        }
        head=prev;
        return head;
    }
}
