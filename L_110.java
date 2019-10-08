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
    public boolean isBalanced(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null) return true; 
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                if(Math.abs(depth(curr.left) - depth(curr.right))>1)
                    return false;
                
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
                
                 
            }
            
        }
        return true;
        
    }
    
    
    public int depth(TreeNode node){
        if(node==null) return 0;
        
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}