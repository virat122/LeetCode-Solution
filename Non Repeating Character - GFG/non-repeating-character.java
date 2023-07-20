//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    
    {
       
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;  i<s.length();  i++){
           if(hm.containsKey(s.charAt(i))){
               hm.put(s.charAt(i),2);
               
           }else{
               hm.put(s.charAt(i),1);
           }
           
       }
       for(int i=0;  i<s.length();  i++){
           if(hm.get(s.charAt(i) )==1){
               return s.charAt(i);
           }
           
       }
       return '$';
       
    
      
       
    }
}

