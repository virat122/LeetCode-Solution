class Solution {
    public int[] searchRange(int[] nums, int t) {

        int []ans=new int[2];
        int p=bin(nums,t,0,nums.length-1);
        if(p==-1){
             ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int i=p;
        while(nums[i]==t ){
            if(i==0){
                i--;
                break;
            }
            i--;
        }
        ans[0]=i+1;
        i=p;
        while(nums[i]==t ){
            if( i==nums.length-1){
                i++;
                break;
            }
            i++;
        }
        ans[1]=i-1;
        return ans;


        


        
    }

    public int bin(int []arr,int t ,int si,int ei){
        int mid=si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        if(arr[mid]==t){
            return mid;
        }
        if(t<arr[mid]){
            return bin(arr,t,si,mid-1);
        }else{

         return bin(arr,t,mid+1,ei);

        }

        
        
    
    }
}