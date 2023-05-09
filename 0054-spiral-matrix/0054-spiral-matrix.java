class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

    ArrayList<Integer> ans=new  ArrayList<Integer>();

        return spiralMatrix(matrix);
    }


    public static List<Integer> spiralMatrix(int [][] mat){
        ArrayList<Integer> ans=new  ArrayList<Integer>();
        int startRow=0;
        int startCol=0;
        int endRow= mat.length-1;
        int endCol= mat[0].length-1;

        //  && operator make capable to print n*m matrix also
        //  || operator make only  capable  for to print n*n matrix

        while (startRow<=endRow && startCol<=endCol) {

            // top row
            for (int i = startCol; i <= endCol; i++) {
                ans.add(mat[startRow][i]);
              //  System.out.print(mat[startRow][i] + " ");
            }

            //right col
            for (int i = startRow + 1; i <= endRow; i++) {
                
                ans.add(mat[i][endCol]);
               // System.out.print(mat[i][endCol] + " ");
            }
            //bottom row
            for (int i = endCol - 1; i >= startCol; i--) {
                if(startRow== endRow){
                    break;
                }
                 ans.add(mat[endRow][i]);

               // System.out.print(mat[endRow][i] + " ");
            }

            //left col
            for (int i = endRow - 1; i >= startRow+1 ; i--) {
                if(startCol== endCol){
                    break;
                }
                 ans.add(mat[i][startCol]);
                //System.out.print(mat[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return ans;


    }
}