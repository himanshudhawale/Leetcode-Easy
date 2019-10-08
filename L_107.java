/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root != null) {
            q.add(root);
        }
        int size;
        TreeNode tmp;
        while(!q.isEmpty()) {
            size = q.size();
            list = new ArrayList<Integer>();
            while(size > 0) {
                tmp = q.poll();
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }            
                if(tmp.right != null) {
                    q.offer(tmp.right);
                }
                list.add(tmp.val);
                size--;
            }
            result.add(0, list);
        }
        return result;
    }
}