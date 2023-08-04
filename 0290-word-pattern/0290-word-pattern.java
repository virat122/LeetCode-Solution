class Solution {
    public boolean wordPattern(String p, String s) {
            String[]arr=s.split(" ");
            if(p.length()!=arr.length)return false;
            
            HashMap<Character , String> map = new HashMap<>();
              HashMap< String,Character > hm = new HashMap<>();
            
            for(int i=0; i<p.length(); i++ ){ 
                    if(!map.containsKey(p.charAt(i))){
                            if(hm.containsKey(arr[i]))return false;
                          map.put(p.charAt(i),arr[i]);
                          hm.put(arr[i] , p.charAt(i));
                    }else{
                            if(!(map.get(p.charAt(i)).equals(arr[i]))  ){
                                    return false;
                            }
                            
                    }
                   
            }
            return true;
            
        
    }
}