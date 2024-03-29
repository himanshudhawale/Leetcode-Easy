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
    public TreeNode sortedArrayToBST(int[] nums) {
        return myfunction(nums, 0, nums.length-1);
    }
    
    public TreeNode myfunction(int[] nums, int start, int end)
    {
        if(start>end)
            return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = myfunction(nums, start, mid-1);
        node.right = myfunction(nums, mid+1, end);
        
        return node;
    }
}