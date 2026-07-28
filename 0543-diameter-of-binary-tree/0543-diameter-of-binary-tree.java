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
    private int maxm = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //find longest path on left subtree and right subtree and add subtract 1 from it bcoz root will be included twice not really :) its not neccesary that the longest path should include the root
       maxm = 0;
       depth(root);
        return maxm;
    }

    public int depth(TreeNode root)
    {
        if(root == null){return 0;}
        int leftd = depth(root.left);
        int rightd = depth(root.right);
        maxm = Math.max(maxm, leftd+rightd);
        return Math.max(leftd,rightd)+1;

    }

}