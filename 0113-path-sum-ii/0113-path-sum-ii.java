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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        if(root == null){return output;}
        helper(root,targetSum,ans,output);
        return output;
        
    }

    public void helper(TreeNode root, int targetSum, List<Integer> ans, List<List<Integer>> output)
    {
        if (root == null) {
        return;
    }

     targetSum -= root.val;
            ans.add(root.val);
       if (root.left == null && root.right == null) {
    if (targetSum == 0) {
        output.add(new ArrayList<>(ans));
    }
}
        if(root == null){
            ans.remove(ans.size()-1);
            return;
        }
        
       
            
            helper(root.left,targetSum,ans,output);

            helper(root.right,targetSum,ans,output);
            ans.remove(ans.size()-1);
            
        
    }
}