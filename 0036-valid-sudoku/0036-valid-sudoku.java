class Solution {
    public boolean isValidSudoku(char[][] board) {
            //box n0=(row/3)*3+ (col/3)
           
            HashSet<String> hs=new HashSet<>();
            
            for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                            
                            if(board[i][j]!='.'){
                                     if(!hs.add("row"+i+board[i][j]) ||!hs.add("col"+j+board[i][j])|| !hs.add("bno"+(i/3)*3+(j/3)+board[i][j]) ){
                                     return false;
                                     }
                                    
                            }
                            
                           
                                   
                    }
            }
            
        return true;
    }
}