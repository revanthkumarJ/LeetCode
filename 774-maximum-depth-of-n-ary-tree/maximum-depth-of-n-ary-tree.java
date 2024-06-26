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
    int ans;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        ans=dfs(root);
        return ans;
    }
    public int dfs(Node root){
        if(root==null){
            return 0;
        }
        int maxDepth=0;
        for(Node i : root.children){
            maxDepth=Math.max(maxDepth,dfs(i));
        }
        return 1+maxDepth;
    }
}