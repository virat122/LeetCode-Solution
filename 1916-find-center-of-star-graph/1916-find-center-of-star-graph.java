class Solution {
    public int findCenter(int[][] edges) {

        int arr[]=new int [edges.length+2];

        for(int i=0;i<edges.length;i++){
            arr[edges[i][0]]++;
            arr[edges[i][1]]++;

        }
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            if(arr[i]==edges.length)return i;
        }
        return -1;
        
    }
}