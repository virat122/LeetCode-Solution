class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        int c=0;
        if(fl.length==1 && fl[0]==0){
            c=1;
        }


 
       
        else if(fl[0]==0 && fl[1]==0){
            fl[0]=1;
            c++;

        }


        for(int i=1;i<fl.length-1;i++){
           
            if(fl[i]==0 && fl[i-1]==0 && fl[i+1]==0){
                fl[i]=1;
                i++;
                c++;
            }

        }
         if( fl.length>=2 && fl[fl.length-1]==0 && fl[fl.length-2]==0){
                fl[fl.length-1]=1;
                c++;

        }
        return n<=c;

        
    }
}