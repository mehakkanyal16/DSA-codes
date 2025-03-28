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
    public void dfs(TreeNode root,String path,List<String>res){
        if(root==null){
            return;
        }
        path+=root.val;
        if(root.left==null&&root.right==null){
            res.add(path);
            return;
        }
        dfs(root.left,path+"->",res);
        dfs(root.right,path+"->",res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
      List<String>res=new ArrayList<>();
      if(root==null)return res;
      dfs(root,"",res);
      return res;
        
    }
}