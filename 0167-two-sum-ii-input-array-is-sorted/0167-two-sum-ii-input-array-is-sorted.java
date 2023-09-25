class Solution {
    public int[] twoSum(int[] num, int t) {
int n=num.length;
        int []arr=new int[2];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(num[i]+num[j]==t){
                    arr[0]=j+1;
                    arr[1]=i+1;
                     return arr;

                }
            }
        }
        return arr;
        
    }
}