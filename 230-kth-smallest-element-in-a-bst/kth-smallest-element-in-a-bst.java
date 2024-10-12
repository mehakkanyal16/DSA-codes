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
    public static void helper(TreeNode root,ArrayList<TreeNode>list){
        if(root==null){
            return;
        }
        helper(root.left,list);
        list.add(root);
        helper(root.right,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode>list=new ArrayList<>();
        helper(root,list);
        return (list.get(k-1).val);
    }
}