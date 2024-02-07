class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        char array[]=s.toCharArray();
        for(char c:array)
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        
        pq.addAll(h.entrySet());
        
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        
        return result.toString();
    }
}