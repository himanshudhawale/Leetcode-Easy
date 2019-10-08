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
    public List<Double> averageOfLevels(TreeNode root) {
        List < Double > ans = new ArrayList < > ();
        Queue < TreeNode > queue = new LinkedList < > ();
        queue.offer(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            int size=queue.size();
            for(int i=0;i<size;i++) {
                TreeNode curr = queue.poll();
                sum += curr.val;
                count++;
                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);
            }
            // queue = curr;
            ans.add(sum * 1.0 / count);
        }
        return ans;
    }
}