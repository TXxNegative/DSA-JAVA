//binary search in an 2d array 

import java.util.Arrays;

public class BS_Q13 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6,7},{8,9}};
        int t=10;
        System.out.println(Arrays.toString(lin_2d_search(arr, t)));

        int[][] twoD_arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int twoD_t=37;
        System.out.println(Arrays.toString(bin_2d_search(twoD_arr, twoD_t)));

        int[][] jagged_arr = {{1, 2, 3},{4, 5, 6, 7},{8, 9},{10, 11, 12, 13, 14}};
        int jagged_t=13;
        System.out.println(Arrays.toString(binary_Search_Jagged(jagged_arr, jagged_t)));

    }
    //find an element in an unsorted 2d array using normal linear search
    static int[] lin_2d_search(int[][] arr,int t){
        int[] found={0,0};
        for(int row=0;row<arr.length;row++){
            for(int elem=0;elem<arr[row].length;elem++){
                if(arr[row][elem]==t){
                    found[0]=row;
                    found[1]=elem;
                    return found;
                }
            }
        }
        found[0]=-1;
        found[1]=-1;
        return found;
    }

    //find the element in 2d array using binary search
    //the 2d array is sorted borth row and column wise
    //this method have O(r+c) and O(1) time and space complexity.
    //only for square matrix
    static int[] bin_2d_search(int[][] matrix,int t){
        int r=0;
        int c=matrix[0].length-1;//selecting the last coloumn index number
        while(r<matrix.length && c>=0){// stopping condition when colomn became > 0 and row > matrix.length(original rows in matrix)
            if(t==matrix[r][c]){ 
                return new int[]{r,c}; 
            }
            
            else if(matrix[r][c]<t){// if row[last] < target then every element behind/left of the last element will be smaller than target .so we reject the row and increase row size by 1.
                r=r+1;
            }

            else {// if target is < colomn[top] then every element below top will be bigger than target .so we reject the colomn and reduce colomn size by 1. 
                c=c-1;
            }
        }
        return new int[]{-1,-1};
    }
    
    // for Jagged 2D array(matrix) search (easy)
    //for any array 
    //O(r log c), O(1) time and space complexity
    //for big matrix search(1000 x 1000) upper one is good method
    static int[] binary_Search_Jagged(int[][] arr, int t) {
        for (int r = 0; r < arr.length; r++) {

            int s = 0;
            int e = arr[r].length - 1;

            while (s <= e) {
                int m = s + (e - s) / 2;

                if (arr[r][m] == t) {
                    return new int[]{r, m};
                }
                else if (arr[r][m] < t) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
