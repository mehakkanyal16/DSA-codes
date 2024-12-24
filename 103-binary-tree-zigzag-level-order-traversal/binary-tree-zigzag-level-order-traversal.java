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
        boolean reverse=false;
        Deque<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                
                if(!reverse){
                    TreeNode curr=q.pollFirst();
                    list.add(curr.val);
                    if(curr.left!=null){
                        q.addLast(curr.left);
                    }
                    if(curr.right!=null){
                        q.addLast(curr.right);
                    }
                    

                }else{
                    TreeNode curr=q.pollLast();
                    list.add(curr.val);
                      if(curr.right!=null){
                        q.addFirst(curr.right);
                    }
                    if(curr.left!=null){
                        q.addFirst(curr.left);
                    }
                  

                }
                
            }
            result.add(list);
            reverse=!reverse;
           

        }
        return result;
    }
}