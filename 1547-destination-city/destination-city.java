class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> start=new HashSet<>();
        HashSet<String> end=new HashSet<>();
        for(List<String> a:paths)
        {
            start.add(a.get(0));
            end.add(a.get(1));
        }
        for(String s:end)
        {
            if(!start.contains(s))
            return s;
        }
        return "";
    }
}