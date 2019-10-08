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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
			return 0;
        }

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int sum = 0;

		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			if (curr.left != null) {
				queue.add(curr.left);
			}
			if (curr.right != null) {
				queue.add(curr.right);
			}
            if(curr.left!=null && curr.left.left==null && curr.left.right==null)
                sum+=curr.left.val; 
		}

		return sum;
    }
}


