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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        
        q.offer(root);
        int ans=0;


        while(!q.isEmpty())
        {
            ans++;
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                    
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
                if(curr.left==null && curr.right==null)
                    return ans;
                
            }
            
        }
        return ans;
        
    }
}