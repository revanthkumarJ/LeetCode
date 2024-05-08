/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int res=0;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=1;i<=s;i++)
            {
                Node ele=q.poll();
                q.addAll(ele.children);
            }
            res++;
        }
        return res;
        
    }
}