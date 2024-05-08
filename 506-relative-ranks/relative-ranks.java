class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> keys=new ArrayList<>();
        int n=score.length;
        for(int i=0;i<n;i++)
        {
            keys.add(score[i]);
        }
        Collections.sort(keys,Collections.reverseOrder());
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(keys.get(i),i+1);
        }

        String res[]=new String[n];
        for(int i=0;i<n;i++)
        {
            int k=map.get(score[i]);
            if(k==1)
            {
                res[i]="Gold Medal";
            }
            else if(k==2)
            {
                res[i]="Silver Medal";
            }
            else if(k==3)
            {
                res[i]="Bronze Medal";
            }
            else
            {
                res[i]=k+"";
            }
        }
        return res;
    }
}