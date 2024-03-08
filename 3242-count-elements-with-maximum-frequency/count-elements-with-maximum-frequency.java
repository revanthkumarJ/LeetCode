import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> array=new HashMap<>();
        int max=0;
        for(int i:nums)
        {
            array.put(i,array.getOrDefault(i,0)+1);
            if(array.get(i)>max)
                max=array.get(i);
        }
        int count=0;
        for(int i:array.values())
        {
            if(i==max)
                count=count+max;
        }
        return count;
    }
}