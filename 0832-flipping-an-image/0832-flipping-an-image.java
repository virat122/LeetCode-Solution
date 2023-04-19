class Solution {
    public int[][] flipAndInvertImage(int[][] im) {

        for(int i=0;i<im.length;i++){

            int j=0,k=im[0].length-1;
            while(j<k){
                int t=im[i][j];
                im[i][j]=im[i][k];
                im[i][k]=t;
                j++;
                k--;
            }
        }
        for(int i=0;i<im.length;i++){
            for(int j=0;j<im[0].length;j++){
                if(im[i][j]==0){
                    im[i][j]=1;
                }else{
                     im[i][j]=0;
                }
            }
        }
        return im;

        
    }
}