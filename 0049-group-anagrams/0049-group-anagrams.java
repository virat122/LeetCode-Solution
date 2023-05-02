class Solution {
    public List<List<String>> groupAnagrams(String[]s) {
            
            List<List<String>>  ans=new ArrayList<>();
            
            Map<String ,List<String>> map=new HashMap<>();
            for(int i=0;i<s.length;i++){
                    
                    char te[]=s[i].toCharArray();
                    Arrays.sort(te);
                    String p=Arrays.toString(te);
                    if(!map.containsKey(p)){
                            map.put(p,new ArrayList<String>());
                    }
                    map.get(p).add(s[i]);                            
            }
            
           // System.out.println(map.size());
            
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                     ans.add(entry.getValue());
             }
            
            return ans;
        
    }
}