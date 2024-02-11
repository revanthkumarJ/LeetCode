class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> array=new HashSet<>();
        for(int i:candyType)
        {
            array.add(i);
        }
        if(array.size()<=(candyType.length/2))
        return array.size();
        return candyType.length/2;
    }
}