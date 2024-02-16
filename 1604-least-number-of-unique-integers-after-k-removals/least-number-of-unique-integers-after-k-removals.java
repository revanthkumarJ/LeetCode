class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> array=new HashMap<>();
        for(int i:arr)
        {
            array.put(i,array.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>(array.values());
        int count=res.size();
        Collections.sort(res);
        for(int i=0;i<res.size();i++)
        {
            if(k<res.get(i))
            return count;
            else
            {
                k=k-res.get(i);
                count--;
            }
        }
        return count;
    }
}