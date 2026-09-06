//binary search in rotated sorted duplicate value array
//there is bug in findPivot
public class BS_Q10 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 0, 1, 2};
        int target = 0;
        int pivot = findPivot(arr);
        System.out.println("Pivot index: " + pivot);
        int ans = search(arr, target, pivot);
        System.out.println("Target index: " + ans);
    }
    static int search(int[] arr, int target, int pivot) {

        // Array is not rotated
        if (pivot == -1) {
            return se(arr, 0, arr.length - 1, target);
        }

        // Target is present in left sorted array
        int ans = se(arr, 0, pivot, target);

        if (ans != -1) {
            return ans;
        }

        // Target is present in right sorted array
        return se(arr, pivot + 1, arr.length - 1, target);
    }

    static int findPivot(int[] arr){

        int s=0;

        int e=arr.length-1;

        while(s<=e){

            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1]){return m;}

            else if (m > s && arr[m] < arr[m - 1]){return m;}

            //if element at middle,start,end are equal then just skip the duplicate

            else if(arr[m]==arr[s] && arr[m]==arr[e]){

                //skipp the duplicates

                //now if the duplicate is the pivot element

                //check if start is pivot

                if(arr[s]>arr[s+1]){return s;}

                s++;

                //check end is pivot or not

                if(arr[e]<arr[e-1]){return e-1;}

                e--;

            }

            else if(arr[s]<arr[m]||(arr[s]==arr[m] && arr[m]>arr[e])){

                s=m+1;

            }

            else{e=m-1;}

        }

        return -1;

    }

    static int se(int[] arr,int t,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(t>arr[m]){s=m+1;}
            else if(t<arr[m]){e=m-1;}
            else{return m;}
        }
        return -1;
    }
}
