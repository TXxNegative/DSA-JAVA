//binary search
//only possible with sorted array
//time complextity for worst case= log N, N=number of elements

import java.util.Scanner;
public class B_S {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,33,34,38,61};
        int target=in.nextInt();
        
        if(binsea(arr,target)==-1){System.out.println("element not in array");}
        else{System.out.println("the element at position: "+binsea(arr, target));}
    }

    static int binsea(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
