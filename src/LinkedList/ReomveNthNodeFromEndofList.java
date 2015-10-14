package LinkedList;

import java.util.List;

/**
 * Created by fyang on 10/14/2015.
 */
public class ReomveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //create two nodes, first and second, first goes n nodes ahead.
        ListNode first = head;
        ListNode second = head;

        //second go n nodes
        for (int i = 0; i < n; i++)
        {
           second=second.next;
        }

        while(second.next!=null)
        {
            first=first.next;
            second=second.next;
        }

        //delete the node first.next points
        first.next=first.next.next;

        return head;

    }
}
