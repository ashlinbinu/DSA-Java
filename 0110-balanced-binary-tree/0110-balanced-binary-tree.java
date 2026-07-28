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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int ans = Depth(root);
        
        
        return (ans == -1)? false:true;
       


        
    }

    public int Depth(TreeNode root)
    {//maxm depth
     if(root == null) return 0;
        int leftDepth = Depth(root.left);
        int rightDepth = Depth(root.right);
        if(leftDepth == -1 || rightDepth == -1){return -1;}
        int ans =  ((int)Math.abs(leftDepth - rightDepth)>1)?-1:1+Math.max(leftDepth,rightDepth);

        return ans;

    }

}