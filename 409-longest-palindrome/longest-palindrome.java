class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean single=false;
        int count=0;
        for(int i:map.values())
        {
            if(i%2==0)
            count+=i;
            else
            {
                count+=(i-1);
                single=true;
            }
        }
        if(single)return count+1;
        return count;
    }
}