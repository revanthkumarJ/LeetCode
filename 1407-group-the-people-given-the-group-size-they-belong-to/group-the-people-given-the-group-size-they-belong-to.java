class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        int n=arr.length;
        HashMap<Integer,ArrayList<Integer>> array=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(array.containsKey(arr[i]))
            {
                (array.get(arr[i])).add(i);
            }
            else
            {
                ArrayList<Integer> a=new ArrayList<>();
                a.add(i);
                array.put(arr[i],a);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i:array.keySet())
        {
            if(i==array.get(i).size())
            {
                res.add(array.get(i));
            }
            else
            {
                ArrayList<Integer> a=array.get(i);
                int ind=0;
                while(ind!=a.size())
                {
                    ArrayList<Integer> nn=new ArrayList<>();
                    for(int k=1;k<=i;k++,ind++)
                    {
                        nn.add(a.get(ind));
                    }
                    res.add(nn);
                }
            }
        }
        return res;
    }
}