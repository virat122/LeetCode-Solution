class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
            int sh1=Integer.valueOf(e1[0].substring(0,2));
            int sm1=Integer.valueOf(e1[0].substring(3,5));
            
               int eh1=Integer.valueOf(e1[1].substring(0,2));
               int em1=Integer.valueOf(e1[1].substring(3,5));  
            
             int sh2=Integer.valueOf(e2[0].substring(0,2));
            int sm2=Integer.valueOf(e2[0].substring(3,5));
            
               int eh2=Integer.valueOf(e2[1].substring(0,2));
               int em2=Integer.valueOf(e2[1].substring(3,5));    
            int s1=(60*sh1)+sm1;
            int s2=(60*sh2)+sm2;
            int et1=(60*eh1)+em1;
            int et2=(60*eh2)+em2;
            
            if((s1<=s2 && s2<=et1)  || (s1<=et2 && et2<=et1)  ||  (s2<=s1 && s1<=et2)  || (s2<=et1 && et1<=et2) )return true;
            
            
            
            return false;
            
            
            
        
    }
}