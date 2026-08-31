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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
        {
            return new int[]{-1,-1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;
        List<Integer> list = new ArrayList<>();
        int j = 2;
        while(nxt!=null && curr != null)
        {
            if(curr.val > prev.val && nxt.val< curr.val)
            {
                list.add(j);
            }
            else if(curr.val< prev.val && curr.val< nxt.val )
            {
                list.add(j);
            }

            prev = curr;
            curr = curr.next;
            nxt = curr.next;
            j++;
        }
        Collections.sort(list);
        if(list.size() <= 1)
        {
             return new int[]{-1,-1};
        }
       
        int max = list.get(list.size()-1) - list.get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i< list.size();i++)
        {
            min = Math.min(min,list.get(i)-list.get(i-1));
        }
        return new int[]{min,max};
    }
}