//find element in biotonic array
public class BS_Q8 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 8, 17, 21, 18, 14, 9, 6, 3};
        int t=6;
        System.out.println(search(arr1, t));
    }
    static int search (int[] arr,int t){
        int peak=peak(arr);
        int firsttry=binarySearch(arr, t,0,peak);// first check on the ascending side of the biotonic array if the target element is present or not
        if(firsttry!=-1){
            return firsttry;
        }
        return binarySearch(arr, t, peak, arr.length-1);// check if the target element is on the descending side of the biotonic array  or not
    } 

    static int peak(int[] arr){// use to find the peak of the biotonic array
    int s=0;
    int e=arr.length-1;

        while (s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1]){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return e; 
    }

    static int binarySearch(int[] arr, int target,int start,int end) // check wether the target element is on ascending side of the array or descending side of the array (using argonomic binary search)
    {
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (ascending) {

                // Ascending order
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }

            } else {

                // Descending order
                if (target < arr[middle]) 
                {
                    start = middle + 1;
                } 
                else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
