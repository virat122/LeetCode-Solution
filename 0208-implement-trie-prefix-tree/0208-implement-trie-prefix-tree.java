class Trie {
         static class Node{
                Node []child=new Node[26];
                boolean eos;
                
                Node(){
                        for(int i=0;i<26;i++){
                           child[i]=null;     
                        }          
                }         
        }
       
        
     Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
             Node curr=root;
            for(int level=0;level<word.length();level++){
                    int idx=word.charAt(level)-'a';
                    if(curr.child[idx]==null){
                        curr.child[idx]=new Node();
                    }
                    curr=curr.child[idx];
            }
            curr.eos=true;
           
        
    }
    
    public boolean search(String word) {
            Node curr=root;
            for(int level=0;level<word.length();level++){
                    int idx=word.charAt(level)-'a';
                    if(curr.child[idx]==null){
                        return false;
                    }
                    curr=curr.child[idx];
            }
            if(curr.eos==true)return true;
           
         return false;
    }
    
    public boolean startsWith(String word) {
            
            
            Node curr=root;
            for(int level=0;level<word.length();level++){
                    int idx=word.charAt(level)-'a';
                    if(curr.child[idx]==null){
                        return false;
                    }
                    curr=curr.child[idx];
            }
           
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */