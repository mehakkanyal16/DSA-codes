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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>>result=new ArrayList<>();
    if(root==null){
        return result;
    }
    Deque<TreeNode>q=new LinkedList<>();
    boolean reverse=false;
    q.offer(root);
    while(!q.isEmpty()){
        int levelSize=q.size();
     List<Integer>currentLevel=new ArrayList<>();
     for(int i=0;i<levelSize;i++){
        if(!reverse){
             TreeNode current=q.pollFirst();
                currentLevel.add(current.val);
                if(current.left!=null){
                    q.addLast(current.left);
                }
                 if(current.right!=null){
                    q.addLast(current.right);
                }



        }else{

            TreeNode current=q.pollLast();
                currentLevel.add(current.val);
                if(current.right!=null){
                    q.addFirst(current.right);
                }
                if(current.left!=null){
                    q.addFirst(current.left);
                }
             

        }
      
     }
     result.add(currentLevel);
       reverse=!reverse;

    }
    return result;
        
    }
}