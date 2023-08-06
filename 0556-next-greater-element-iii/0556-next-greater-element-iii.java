class Solution {
    public void rev(char[] arr, int s) { 
            int l=arr.length-1;
            while(s<l){
                    char t=arr[s];
                    arr[s]=arr[l];
                    arr[l]=t;
                    s++;
                    l--;
            }
    }
    public int nextGreaterElement(int n) { 
            char[] arr=(""+n).toCharArray();
            int i=arr.length-2;
            
            while(i>=0 && arr[i]>=arr[i+1])  i--;
            
            if(i==-1)return -1;
            
            int j=arr.length-1;
            while(arr[i]>=arr[j])j--;           
               char t=arr[i];
               arr[i]=arr[j];
               arr[j]=t;
            
            rev(arr,i+1);
            
            try{
                    return Integer.parseInt(new String (arr));
            }catch(Exception e){
                    return -1;
            }
            
                  
            
           
    }
}