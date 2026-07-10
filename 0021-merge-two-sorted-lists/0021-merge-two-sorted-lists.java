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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        // ListNode head = null;
        // ListNode temp = null;
        while(list1!=null &&list2!=null)
        {
            
            int curr1 = (list1==null)?0:list1.val;
            int curr2 = (list2==null)?0:list2.val;
            
            if(curr1<=curr2)
            {
                
                tail.next = list1;
                list1 = list1.next;
               
            }
            else
            { tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;
            
            
        }
        if(list1!=null)
        {
            tail.next = list1;
        }
        else if(list2!=null)
        {
                tail.next = list2;
        }
        return dummy.next;
        
    }
}