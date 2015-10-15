package LinkedList;

/**
 * Created by fyang on 10/15/2015.
 * 1. calculate the length of each list
 * 2. offset the longer one
 * 3. proceed the two lists together and check intersection
 */
public class EasyIntersectonOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        //calc length
        int len1=0;
        int len2=0;
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=null)
        {
            p1=p1.next;
            len1++;
        }

        while(p2!=null)
        {
            p2=p2.next;
            len2++;
        }

        //offset the longer one
        if(len1>len2)
        {
            for(int i=0;i<len1-len2;i++)
            {
                headA=headA.next;
            }
        }
        else
        {
            for(int i=0;i<len2-len1;i++)
            {
                headB=headB.next;
            }
        }

        //compare
        while(headA!=null)
        {
            if(headA.val==headB.val)
                return headA;
            else
            {
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }
}
