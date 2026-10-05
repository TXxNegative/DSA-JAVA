//worst case = O(N^2)
//best case = O(n^2)
//stable = no
//it performs well on small arrays.

import java.util.Arrays;

public class sort_selection {
    public static void main(String[] args) {
        int[] arr={2,43,5,4,6,7,45,1,12,44};
        sel_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sel_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last  = arr.length-1-i;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    static int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
