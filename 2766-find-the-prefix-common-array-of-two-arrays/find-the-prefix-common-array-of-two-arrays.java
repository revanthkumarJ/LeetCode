class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        HashMap<Integer,Integer> aMap = new HashMap<>();
        HashMap<Integer,Integer> bMap = new HashMap<>();
        int res=0;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            int first= A[i];
            int second = B[i];
            aMap.put(first,aMap.getOrDefault(first,0)+1);
bMap.put(second,bMap.getOrDefault(second,0)+1);
            if(first==second){
                res++;
            }
            else{
            if(bMap.containsKey(first)){
                res++;
            }
            if(aMap.containsKey(second)){
                res++;
            }}
            result[i]=res;
        }

    return result;
    }
}