/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){return ans;}
        Deque<TreeNode> q= new ArrayDeque<>();
        int side = 0;
        q.offerFirst(root);

        while(!q.isEmpty())
        {
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            
            if(side == 0)
            {

                for(int i = 0; i<n;i++)
                {
                    TreeNode curr = q.pollFirst();
                
                 if (curr.left != null) { q.offerLast(curr.left); }
                if (curr.right != null) { q.offerLast(curr.right); }
                list.add(curr.val);}
            }
            else if(side == 1)
            {
                 for(int i = 0; i<n;i++)
                {
                    TreeNode curr = q.pollLast();
                
                if (curr.right != null) { q.offerFirst(curr.right); }
                if (curr.left != null) { q.offerFirst(curr.left); }
                list.add(curr.val);}
            }
            side = (side == 1)?0:1;
            ans.add(list);
        }
        return ans;


    }
}