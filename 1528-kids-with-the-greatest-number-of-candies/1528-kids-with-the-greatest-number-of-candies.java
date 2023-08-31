class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int ex) {

        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int i:can){
            if(max<i){
                max=i;
            }
        }

        for(int i=0;i<can.length;i++){
            if(can[i]+ex>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
      
        
    }
}