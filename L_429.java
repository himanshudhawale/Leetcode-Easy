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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
		
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
		
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for(int i=0;i<size;i++) {
                Node node = queue.poll();
                currentList.add(node.val);
                for(Node n: node.children)
                    queue.offer(n);
            }
            result.add(currentList);
        }
        return result;
    }
}



