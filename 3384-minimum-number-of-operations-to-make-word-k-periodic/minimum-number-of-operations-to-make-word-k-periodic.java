class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int maxFreq=0;
        for(int i=0;i<word.length();i=i+k)
        {
            String r=word.substring(i,i+k);
            map.put(r,map.getOrDefault(r,0)+1);
            if(map.get(r)>maxFreq)
            {
                maxFreq=map.get(r);
            }
        }
        return (word.length()/k)-maxFreq;
    }
}