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
    public int deepestLeavesSum(TreeNode root) {
        if (root== null) { 
            return 0;
        }
          // Initialize an empty queue.
        Queue<TreeNode> qu= new LinkedList<>(); 
        // push the root of the tree into the queue
        qu.offer(root); 
        // initialize sum of current level to 0
        int sumOfCurrLevel= 0; 
          // loop until the queue is not empty
        while (!qu.isEmpty()) { 
            int size = qu.size();
            sumOfCurrLevel = 0;
            while (size-- > 0) {
                TreeNode head = qu.poll();
                sumOfCurrLevel += head.val;
                // if the left child of the head is not null
                if (head.left!= null) { 
                    //push the child into the queue
                    qu.offer(head.left); 
                }
                // if the right child is not null
                if (head.right!= null) { 
                   // push the child into the queue
                    qu.offer(head.right); 
                }
            }
        }
        return sumOfCurrLevel;
        
    }
}