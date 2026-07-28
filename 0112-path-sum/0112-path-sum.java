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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //left path
          if(root == null){return false;}

       targetSum -= root.val;
        int targetsumleft = targetSum;
        int targetsumright = targetSum;
        if(root.left == null && root.right == null){return targetSum == 0;}//base case


        return hasPathSum(root.left,targetsumleft) || hasPathSum(root.right,targetsumright);

       
        
    }

    
    
}