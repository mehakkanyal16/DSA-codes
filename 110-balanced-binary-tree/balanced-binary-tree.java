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
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int diff=Math.abs(height(root.left)-height(root.right));
        return (diff<=1)&&isBalanced(root.left)&&isBalanced(root.right);
        
    }
}