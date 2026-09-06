//search in a rotated sorted array
//ex:-[4,5,6,7,0,1,2]
//there is no duplicate array
public class BS_Q9 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int t=2;
        System.out.println(pivot1(arr, t));
    }
    
    //find the pivot element (biggest element int the array), then there are two ascending sorted array , then fint element in those arrays.
    
    //METHOD - 1
    static int pivot(int[] arr,int t){//finding pivot using linear search
        int big=0;
        for(int i=0;i<arr.length;i++){
            if(big<arr[i]){
                big=i;
            }
        }
        int search=se(arr,t,0,big);
        if(search!=-1){
            return search;
        }
        return se(arr,t,big+1,arr.length-1);
    }

    //METHOD - 2
    static int pivot1(int[] arr, int t) {//pivot element using binary search
    int s = 0;
    int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1]) {//return m; //when arr[m] > arr[m+1] ,ex:-int[] arr={4,5,6,7,0,1,2}; when m=3, arr[3]>arr[4] and middle is smaller than ending index (to avoid out of index situation)
                int pivot = m;

                int search = se(arr, t, 0, pivot);
                if (search != -1) {
                    return search;
                }

                return se(arr, t, pivot + 1, arr.length - 1);
            }

            else if (m > s && arr[m] < arr[m - 1]) {//return m; //when arr[m] < arr[m-1] ,ex:-int[] arr={4,5,6,7,0,1,2}; when m=4, arr[4]<arr[3] and middle is bigger than starting index (to avoid out of index situation)
                int pivot = m;

                int search = se(arr, t, 0, pivot - 1);
                if (search != -1) {
                    return search;
                }

                return se(arr, t, pivot, arr.length - 1);
            }

            else if (arr[m] <= arr[s]) {
                e = m - 1;
            }

            else {
                s = m + 1;
            }
        }

        // Array is not rotated
        return se(arr, t, 0, arr.length - 1);//return -1 //this function will return -1 when the array is not a rotated sorted array ex:-[1,2,3,4,5,6,7]
    }

    //normal binary search for searching each array
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
