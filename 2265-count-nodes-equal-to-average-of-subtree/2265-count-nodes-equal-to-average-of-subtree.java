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
    public int heightfinder(TreeNode n)
    {
        if(n==null){return 0;}
        int left = heightfinder(n.left);
        int right = heightfinder(n.right);
        return 1+left+right;
        
    }
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        //base case
        if(root == null)
        {
            return 0;
        }
        if(sum(root)/(heightfinder(root)) == root.val)
        {
            count++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
return count;
    }

    public int sum(TreeNode root)
    {
        //base case
        if(root == null)
        {
            return 0;
        }
        
        
        return root.val+sum(root.left)+sum(root.right);
        
    }

}