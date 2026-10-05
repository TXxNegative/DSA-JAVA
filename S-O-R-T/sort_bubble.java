//bubble sort/sinking sort/swaping or replacing sort/in place sorting algo
//space complexity = O(1)(constant) //no extra space required like copying the array,etc not required.
//inplace sorting algorithm = we dont need to make a copy of array of consume more space.
//time complexity = best case: O(N) ,  worst case: O(N^2)
//it is a stable sorting algorithm. 

import java.util.Arrays;

public class sort_bubble{
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}