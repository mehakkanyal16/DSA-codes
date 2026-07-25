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
        List<List<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rev = false;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                if (!rev) {
                    TreeNode curr = q.pollLast();
                    list.add(curr.val);
                    if (curr.left != null)
                        q.addFirst(curr.left);
                    if (curr.right != null)
                        q.addFirst(curr.right);
                }

                if (rev) {
                    TreeNode curr = q.pollFirst();
                    list.add(curr.val);
                    if (curr.right != null)
                        q.addLast(curr.right);
                    if (curr.left != null)
                        q.addLast(curr.left);
                }

            }
            res.add(list);
            rev = !rev;

        }
        return res;

    }
}