package LinkedList;

/**
 * Created by fyang on 10/15/2015.
 */
public class EasyReomveLInkedListElements {
    public static ListNode removeElements(ListNode head, int val) {

        if(head==null)return null;
        ListNode p=new ListNode(0);
        p.next=head;
        head=p;
        while(p.next!=null)
            if(p.next.val==val)
            {
                p.next=p.next.next;
            }
        else
            {
                p=p.next;
            }

        return head.next;
    }
}
