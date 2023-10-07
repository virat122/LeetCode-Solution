class Solution {
   public boolean isIsomorphic (String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }
        return true;
        // return isIs(s,t);
    }
    public boolean isIs (String s, String t){
        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){   
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)));return false;
            }else{
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;



    }
}