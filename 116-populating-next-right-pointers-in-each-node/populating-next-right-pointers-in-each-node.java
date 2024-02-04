/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
        return null;
        Queue<Node> array=new LinkedList<>();
        array.add(root);
        while(!array.isEmpty())
        {
            int count=array.size();
            for(int i=1;i<=count;i++)
            {
                Node curr=array.poll();
                if(curr.left!=null)
                array.add(curr.left);
                if(curr.right!=null)
                array.add(curr.right);
                if(i!=count)
                curr.next=array.peek();
                else
                curr.next=null;
            }
        }
        return root;
    }
}