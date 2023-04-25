import java.util.Iterator;
import java.util.TreeSet;
class SmallestInfiniteSet {
        
        PriorityQueue <Integer>tre;


    public SmallestInfiniteSet() {
            
         this.tre = new PriorityQueue<Integer>();
            for(int i=1;i<=1000;i++){
                    tre.add(i);
            }
            
            
    }
    
    public int popSmallest() {
            // if(tre.size()>0){
                   return  tre.poll();
           // }
        
    }
    
    public void addBack(int num) {
            if(!tre.contains(num))
            tre.add(num);
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */