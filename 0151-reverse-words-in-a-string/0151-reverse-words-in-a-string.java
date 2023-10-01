class Solution {



    public String reverseWords(String s) {
        
        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; --i){
            str.append(words[i] + " ");
        }

        return str.toString().trim();
    }
    // public String reverseWords(String s) {
    //     s= s.replaceAll("( )+", " ");
    //     String[] res =s.split(" ");
    //     int i=0,j=res.length-1;

    //      while(i<j){

    //          String t=res[i].trim();
    //          res[i]=res[j].trim();
    //          res[j]=t;
            
    //          i++;
    //          j--;
    //      }
    //      String ans="";
    //      for(String p: res){
    //          ans+=p+" ";
    //      }
    //      return ans.trim();
    // //     String mytext = " hello     there   ";
    // //    mytext = mytext.replaceAll("( )+", " ");
        
    // }
}