class TrieNode{
    private TrieNode links[];
    private final int R=26;
    private boolean isEnd=false;

    public TrieNode(){
        links= new TrieNode[R];
    }

    public boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    public TrieNode get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch,TrieNode lin){
        links[ch-'a']=lin;
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean getIsEnd(){
        return isEnd;
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root= new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            if(curr.containsKey(c)){
                curr=curr.get(c);
            }
            else{
                curr.put(c,new TrieNode());
                curr=curr.get(c);
            }
        }
        curr.setEnd();
    }
    
    public TrieNode getPrefix(String s){
        TrieNode node = root;
        for(char c:s.toCharArray()){
            if(node.containsKey(c)){
                node=node.get(c);
            }
            else
            return null;
        }
        return node;
    }

    public boolean search(String word) {
        TrieNode node= getPrefix(word);
        return node!=null && node.getIsEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node= getPrefix(prefix);
        return node!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */