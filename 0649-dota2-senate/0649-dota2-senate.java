class Solution {
    public String predictPartyVictory(String s) {
            int n=s.length();
             Queue<Integer> r = new LinkedList<>();
              Queue<Integer> d = new LinkedList<>();
            for(int i=0;i<n;i++){
                    if(s.charAt(i)=='R')r.add(i);
                    else d.add(i);
            }
            
            while(!r.isEmpty() && !d.isEmpty()){
                    if(r.peek()>d.peek()){
                            r.remove();
                            int t=d.remove();
                            d.add(t+n);
                    }else{
                            d.remove();
                            int t=r.remove();
                            r.add(t+n) ;
                    }                        
            }
 
            return d.isEmpty()?"Radiant":"Dire";
        
    }
}