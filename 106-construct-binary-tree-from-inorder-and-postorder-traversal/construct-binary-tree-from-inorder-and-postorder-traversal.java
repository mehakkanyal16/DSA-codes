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
    int postIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx=postorder.length-1;
        return helper(inorder,postorder,0,inorder.length-1);
        
    }
    public TreeNode helper(int[] inorder,int[] postorder ,int left,int right){
        if(left>right)return null;
        TreeNode root=new TreeNode(postorder[postIdx]);
        int idx=search(inorder,left,right,postorder[postIdx]);
        postIdx--;
        root.right=helper(inorder,postorder,idx+1,right);
        root.left=helper(inorder,postorder,left,idx-1);
        return root;
       

    } 
    public int search(int[] inorder,int left,int right,int key){
        for(int i=left;i<=right;i++){
            if(inorder[i]==key)return i;
        }
        return -1;
    }
}