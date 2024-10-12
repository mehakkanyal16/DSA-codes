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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
           List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        

        while(!q.isEmpty()){
            int levelSize=q.size();
        List<Integer>currentLevel=new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                TreeNode current=q.poll();
                currentLevel.add(current.val);
                if(current.left!=null){
                    q.offer(current.left);
                }
                 if(current.right!=null){
                    q.offer(current.right);
                }

            }
            result.add(0,currentLevel);
        }
        return result;
    }
}