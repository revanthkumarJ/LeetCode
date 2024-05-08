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
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> a=new ArrayList<>();
            for(int i=1;i<=s;i++)
            {
                Node ele=q.poll();
                a.add(ele.val);
                q.addAll(ele.children);
            }
            res.add(a);
        }
        return res;
    }
}