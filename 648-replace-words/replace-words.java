class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set=new HashSet<>(dictionary);
        String words[]=sentence.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            StringBuilder r=new StringBuilder();
            for(char c:s.toCharArray())
            {
                r.append(c);
                if(set.contains(r.toString()))
                {
                    words[i]=r.toString();
                    break;
                }
            }
            res.append(words[i]);
            res.append(" ");
        }
        sentence=res.toString();
        return sentence.substring(0,sentence.length()-1);
        
        
    }
}