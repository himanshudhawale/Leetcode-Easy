/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root==null) return 0;
        
        q.offer(root);
        int ans=0; 
        
        while(!q.isEmpty())
        {
            int size= q.size();
            for(int i=0;i<size;i++)
            {
                Node curr = q.poll();
                for(Node n:curr.children)
                    q.offer(n);
                
            }
            ans++;
        }
        return ans;
    }
}