package LinkedList;

/**
 * Created by fyang on 10/14/2015.
 */
public class EasyMergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      //initiate a fake head, keep fake head, don't lose it
        ListNode fakehead=new ListNode(0);
        ListNode temp=fakehead;

      // add the smaller node to the fake head
      while(l1!=null && l2!=null)
      {
          if(l1.val<=l2.val)
          {
              temp.next=l1;
              l1=l1.next;
          }
          else
          {
              temp.next=l2;
              l2=l2.next;
          }

          temp=temp.next;
      }

      // check each list, if list is null, append the other one to the fake head
        if(l1==null)
        {
          temp.next=l2;
        }
        if(l2==null)
        {
            temp.next=l1;
        }

        return fakehead.next;
    }
}
