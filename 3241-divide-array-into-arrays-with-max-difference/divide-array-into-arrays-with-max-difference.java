import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int size = nums.length;
        if (size % 3 != 0)
            return new int[0][0];
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int groupIndex = 0;
        for (int i = 0; i < size; i += 3) 
        {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) 
            {
                ArrayList<Integer> aa=new ArrayList<>();
                aa.add(nums[i]);
                aa.add(nums[i+1]);
                aa.add(nums[i+2]);
                result.add(aa);
                groupIndex++;
            } 
            else
                return new int[0][0];
        }
        int array[][]=new int[groupIndex][3];
        for(int i=0;i<groupIndex;i++)
        {
            array[i][0]=result.get(i).get(0);
            array[i][1]=result.get(i).get(1);
            array[i][2]=result.get(i).get(2);
        }
        return array;
    }
}