class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new   HashMap<Integer,Integer>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int k: hm.values()){
            if(!hs.add(k))return false;
           

        }
        return true;
    }
}