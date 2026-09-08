//for a strict 2D array(matrix) binary search

import java.util.Arrays;

public class BS_Q14 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}        
        };
        int t=6;
        System.out.println(Arrays.toString(search(arr, t)));
    }
    static int[] search(int[][] matrix,int t){
        int rows=matrix.length;
        int cols=matrix[0].length; //be careful matrix may be empty
        
        if(rows==1){
            return binsearch(matrix, 0, t, 0, cols-1);
        }

        int row_s=0;
        int row_e=rows-1;
        int col_m=cols/2;

        //run the loop till the two rows are remaining
        while(row_s<(row_e-1)){//while this is true it will have more than two rows
            int m=row_s+(row_e-row_s)/2;
            if(matrix[m][col_m]==t){
                return new int[]{m,col_m};
            }
            if(matrix[m][col_m]<t){
                row_s=m;
            }
            else{row_e=m;}
        }
        //now we have tow rows
        //check wether the target is in the colomn of 2 rows
        if(matrix[row_s][col_m]==t){
            return new int[]{row_s,col_m};
        }
        if(matrix[row_s+1][col_m]==t){
            return new int[]{row_s+1,col_m};
        }
        
        //otherwise search in 1st half
        if(t<=matrix[row_s][col_m-1]){
            return binsearch(matrix, row_s, t, 0, col_m-1);
        }
        
        //otherwise search in 2nd half
        if(t>=matrix[row_s][col_m+1] && t<=matrix[row_s][cols-1]){
            return binsearch(matrix, row_s, t, col_m+1, cols-1);
        }
        
        //otherwise search in 3rd half
        if(t<=matrix[row_s+1][col_m-1]){
            return binsearch(matrix, row_s+1, t, 0, col_m-1);
        }
        
        //otherwise search in 4th half
        else{
            return binsearch(matrix, row_s+1, t, col_m+1, cols-1);
        }
    }

    static int[] binsearch(int[][] matrix,int row,int t,int col_s,int col_e){
        
        while(col_s<=col_e){
            int m=col_s+(col_e - col_s)/2;
            if(t<matrix[row][m]){col_e=m-1;}
            else if(t>matrix[row][m]){col_s=m+1;}
            else{
                return new int[]{row,m};
            }
        }
        return new int[]{-1,-1};
    }
}
