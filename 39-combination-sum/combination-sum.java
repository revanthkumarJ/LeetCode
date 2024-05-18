class Solution {
     List<List<Integer>> res;
     HashSet<List<Integer>> set;
    public void add(int a[],int i,int target,ArrayList<Integer> arr ,int curr)
    {
        if(curr==target)
        {
            ArrayList<Integer> aa=new ArrayList<>(arr);
            if(!set.contains(aa))
            res.add(aa);
            set.add(aa);
        }
        else if(curr>target)
        return ;
        else
        {
            if(i!=a.length)
            {
                ArrayList<Integer> aa=new ArrayList<>(arr);
                aa.add(a[i]);
                add(a,i+1,target,arr,curr);
                add(a,i,target,aa,curr+a[i]);
                add(a,i+1,target,aa,curr+a[i]);
            }
        }
        
    }
    public List<List<Integer>> combinationSum(int[] a, int target) {
        res=new ArrayList<>();
        set=new HashSet<>();
        add(a,0,target,new ArrayList<>(),0);
        return res;
    }
}