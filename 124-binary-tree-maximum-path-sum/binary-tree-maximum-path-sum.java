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
    int maxPathSum=Integer.MIN_VALUE;
    public int sum(TreeNode root){
        if(root==null)return 0;
        int leftSum=Math.max(0,sum(root.left));
        int rightSum=Math.max(0,sum(root.right));
        int sum=leftSum+rightSum+root.val;
        maxPathSum=Math.max(maxPathSum,sum);
        return Math.max(leftSum,rightSum)+root.val;

    }

    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxPathSum;
       
        
    }
}