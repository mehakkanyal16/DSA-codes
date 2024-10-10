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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        

        while(!q.isEmpty()){
            int levelSize=q.size();
        double averageLevel=0;
            
            for(int i=0;i<levelSize;i++){
                TreeNode current=q.poll();
                averageLevel+=current.val;
                if(current.left!=null){
                    q.offer(current.left);
                }
                 if(current.right!=null){
                    q.offer(current.right);
                }

            }
            averageLevel=averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }
}