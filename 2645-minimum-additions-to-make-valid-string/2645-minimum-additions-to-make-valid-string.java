class Solution {
    public int addMinimum(String w) {
           
         
                 Stack <Character> st=new Stack<>();
            int i=0;
            while(i<w.length()){
                    if(st.isEmpty()){
                            if(w.charAt(i)=='a'){
                                    st.push(w.charAt(i));
                            }else if(w.charAt(i)=='b'){
                                    st.push('a');
                                    st.push(w.charAt(i));
                            }else { st.push('a');
                                    st.push('b');
                                    st.push(w.charAt(i));
                            }
                           
                    }else{
                            
                             if(w.charAt(i)=='a' && st.peek()=='a'){
                                    st.push('b');
                                    st.push('c');
                                    st.push(w.charAt(i));
                            }else if(w.charAt(i)=='a' && st.peek()=='b'){
                                    st.push('c');
                                    st.push(w.charAt(i));
                            } else if(w.charAt(i)=='a' && st.peek()=='c'){ 
                                    st.push(w.charAt(i));
                            }
                            else if(w.charAt(i)=='b'  && st.peek()=='a'){
                                    st.push(w.charAt(i));
                            }else if(w.charAt(i)=='b'  && st.peek()=='b'){
                                    st.push('c');
                                    st.push('a');
                                    st.push(w.charAt(i));
                            }else if(w.charAt(i)=='b'  && st.peek()=='c'){
                                    st.push('a');
                                    st.push(w.charAt(i));
                            }
                            else if(w.charAt(i)=='c'  && st.peek()=='a'){
                                    st.push('b');
                                    st.push(w.charAt(i));
                            }
                            else if(w.charAt(i)=='c'  && st.peek()=='b'){
                                  
                                    st.push(w.charAt(i));
                            }
                            else if(w.charAt(i)=='c'  && st.peek()=='c'){
                                    st.push('a');
                                     st.push('b');
                                    
                                    st.push(w.charAt(i));
                            }
                        
                    }
                    i++;
                    
            }
                           if(st.peek()=='a'){
                                    st.push('b');
                                   st.push('c');
                            }else if(st.peek()=='b'){
                                    st.push('c');
                                   
                            }
            return st.size()-w.length();
    }

        

}