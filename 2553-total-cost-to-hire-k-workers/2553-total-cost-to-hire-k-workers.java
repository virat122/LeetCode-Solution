class Solution {
    public long totalCost(int[] co, int k, int ca) {
         PriorityQueue<Integer> pqf
            = new PriorityQueue<Integer>();
         PriorityQueue<Integer> pqb
            = new PriorityQueue<Integer>();
        
        long ans=0;
        int f=0,b=co.length-1;
        for(int i=0;i<ca;i++){
            if(f<b){
            pqf.add(co[f++]);
            pqb.add(co[b--]);
            }else if(f==b){
                 pqf.add(co[f++]);
                 break;
            }
            
        }
       //  System.out.print(pqb+"  "+pqf);
        for(int i=0;i<k;i++){
            if(!pqb.isEmpty() && !pqf.isEmpty() ){
                if(pqb.peek()< pqf.peek()){
                    // System.out.print(pqb.peek()+"  "+i +" ");
                    //  System.out.print(pqb+"  "+pqf);
                    ans+=pqb.poll();
                      if(b>=f)
                     pqb.add(co[b--]);
                     
                }else{
                //    System.out.print(pqf.peek()+"  "+i+" ");
                //     System.out.print(pqb+"  "+pqf);
                    ans+=pqf.poll();

                       if(b>=f)
                    pqf.add(co[f++]);

                }

            }else if(!pqb.isEmpty() ){
            //    System.out.print(pqb.peek()+"  ");
                 ans+=pqb.poll();

            }else if( !pqf.isEmpty()){
             //   System.out.print(pqf.peek()+"  ");
                 ans+=pqf.poll();

            }
            

            
        }
        return ans;

        
    }
}