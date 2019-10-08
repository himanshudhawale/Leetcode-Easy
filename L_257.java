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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if(root==null)return list;
        
        StringBuilder sb = new StringBuilder();
        dfs(root,sb,list);
        return list;
    }
    private void dfs(TreeNode root, StringBuilder sb,List<String> list){
        if(root.left==null && root.right==null){
            list.add(sb.toString()+root.val);
            return;
        }
    
        int len = sb.length();
        if(root.left!=null){
            sb.append(root.val+"->");
            dfs(root.left,sb,list);
            sb.setLength(len);
        }
        
        if(root.right!=null){
            sb.append(root.val+"->");
            dfs(root.right,sb,list);
            sb.setLength(len);
        }
        
    }
    
}