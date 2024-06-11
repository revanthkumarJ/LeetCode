
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0,j=0,m=arr2.length,n=arr1.length;

        while(j<m)
        {
            int ele=arr2[j];
            if(map.containsKey(ele))
            {
                int f=map.get(ele);
                for(int k=1;k<=f;k++)
                {
                    arr1[i]=ele;
                    i++;
                }
                map.remove(ele);
            }
            j++;
        }
        ArrayList<Integer> rem=new ArrayList<>();
        for(int ele:map.keySet())
        {
            int freq=map.get(ele);
            for(int k=1;k<=freq;k++)
            {
                rem.add(ele);
            }
        }
        Collections.sort(rem);
        j=0;
        for(int ele:rem)
        {
            arr1[i++]=ele;
        }
        return arr1;

    }
}