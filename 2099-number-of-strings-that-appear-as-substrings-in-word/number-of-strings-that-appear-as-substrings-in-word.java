class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(String w:patterns){
            if(word.contains(w)){
                res++;
            }
        }
        return res;
    }
}