class Solution {
    List<List<Integer>> res;
    public void ins(List<Integer> array,int i)
    {
        if(i==array.size()-1){
            ArrayList<Integer> r=new ArrayList<>();
            r.addAll(array);
        res.add(r);
        return ;
        }
        for(int j=i;j<array.size();j++)
        {
            
            int temp=array.get(i);
            array.set(i,array.get(j));
            array.set(j,temp);
            ins(array,i+1);
            temp=array.get(i);
            array.set(i,array.get(j));
            array.set(j,temp);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:nums)
        {
            array.add(i);
        }
        ins(array,0);
        return res;
    }
}