class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)
        return 1;
        HashSet<Integer> left=new HashSet<>();
        HashMap<Integer,Integer> right=new HashMap<>();
        
        for(int i=0;i<trust.length;i++)
        {
            left.add(trust[i][0]);
            right.put(trust[i][1],right.getOrDefault(trust[i][1],0)+1);
        }
        for(int i:right.keySet())
        {
            if(!left.contains(i) && right.get(i)==n-1)
            return i;
        }
        return -1;
    }
}