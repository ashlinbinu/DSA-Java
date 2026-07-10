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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while(l1!=null || l2!= null|| carry!=0)
        {
            int val1 = (l1!=null)?l1.val:0;
            int val2 = (l2!=null)?l2.val:0;
            
            ListNode newNode = new ListNode((val1+val2+carry)%10);
            carry = (val1+val2+carry)/10;
            if(head==null)
            {
                head = newNode;
                temp =newNode;
            }
            else
            {
            temp.next = newNode;
              temp = temp.next;
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }



        if(carry!=0)
        {
            ListNode newNode = new ListNode(carry);
            
        }
        return head;
    }
}