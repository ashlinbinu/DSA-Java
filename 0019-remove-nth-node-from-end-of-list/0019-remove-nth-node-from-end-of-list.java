/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null)
        {
            return null;
        }
        if(head.next.next == null && n==1)
        {
            head.next = null;
            return head;
        }
        if(head.next.next == null && n==2)
        {
            head = head.next;
            return head;
        }
        ListNode np = head;
        ListNode pointer = head;
        for(int i = 0;i<n;i++)
        {
            pointer = pointer.next;
        }
        

        ListNode prev = null;
        while(pointer!=null)
        {
            prev= np;
            np = np.next;
            pointer = pointer.next;
        }
        if(np == head)
        {
            return head.next;
        }
        
        if(prev!=null && np != null)
        {prev.next = np.next;}
        
        
        return head;


    }
}