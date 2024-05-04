class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> array=new ArrayList<>(map.keySet());
        int n=array.size();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(map.get(array.get(i))<map.get(array.get(j)))
                {
                    int temp=array.get(i);
                    array.set(i,array.get(j));
                    array.set(j,temp);
                }
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=array.get(i);
        }
        return res;
    }
}