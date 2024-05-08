class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)>=list2.get(j)){
                ans.add(list2.get(j));
                j++;
            }
            else{
                ans.add(list1.get(i));
                i++;
            }
        }
        while(i<list1.size()){
            ans.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null)
            return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}