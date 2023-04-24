class Solution {
    public int lastStoneWeight(int[] st) {
            
            PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i:st){
                    heap.add(i);
            }
            
            while(heap.size()>1){
                    int t1=heap.poll();
                    int t2=heap.poll();
                    
                    if(t1==t2){
                            continue;
                    }else if(t1>t2){
                            heap.add(t1-t2);
                    }else{
                            heap.add(t2-t1);
                    }      
            }
            if(heap.size()==1){
                    return heap.poll();
            }else{
                    return 0;
            }
        
    }
}