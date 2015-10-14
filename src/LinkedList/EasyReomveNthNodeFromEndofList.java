package LinkedList;

import java.util.List;

/**
 * Created by fyang on 10/14/2015.
 */
public class EasyReomveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //corner case
        if(head==null)
        {
            return null;
        }
        //create two nodes, slow and fast, fast goes n nodes ahead.
        ListNode fast = head;
        ListNode slow = head;

        //second go n nodes
        for (int i = 0; i < n; i++)
        {
            fast=fast.next;
        }

        if(fast==null)
        {
            head=head.next;
            return head;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        //delete the node first.next points
        slow.next=slow.next.next;

        return head;

    }
}
