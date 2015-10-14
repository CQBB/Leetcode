package LinkedList;

/**
 * Created by fyang on 10/14/2015.
 * http://www.programcreek.com/2012/12/leetcode-merge-two-sorted-lists-java/
 */
public class EasyDeleteNode {
    public static   void deleteNode(ListNode node)
    {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
