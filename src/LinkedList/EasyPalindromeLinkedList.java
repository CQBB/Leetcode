package LinkedList;

import java.util.List;

/**
 * Created by fyang on 10/15/2015.
 */
public class EasyPalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
         //corner case
        if(head==null||head.next==null)
            return true;
         //find the list center
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode secondHead=slow.next;
        //disconnect two parts
        slow.next=null;
        //reverse the list
        ListNode Next=null;
        ListNode prev=null;
        ListNode cur=secondHead;

        while(cur!=null)
        {
            Next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=Next;
        }
        secondHead=prev;
        //compare two lists
        //Only consider secondhead, if the linked list size is odd. The head is bigger than the secondhead. like head 2->1->3, second head 2->1.The linked list is still palindrome.
        while(secondHead!=null)
        {
            if(head.val!=secondHead.val)
                return false;
            head=head.next;
            secondHead=secondHead.next;
        }

        return true;

    }
}
