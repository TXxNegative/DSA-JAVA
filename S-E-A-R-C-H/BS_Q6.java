//find position of an element in an infinite sorted array . and we cant use length function.
//we are doing a test case her for the array so after some time here the range of array will be exceeded while we ranging our array , so before getting in that situation we must find the elemetn or it will give error
//ex: t=207,arr={12, 25, 31, 44, 57,63, 78, 81, 95, 103,117, 124, 136, 145, 159,167, 178, 184, 196, 207,215, 228, 239, 247, 259} while finding the range of array here by doubling the range the last range will be from index 14 to index 24 there will be 11 elements but we will searching the element beyond the 24 for exactly 16 elements.
public class BS_Q6 {
    public static void main(String[] args) {
        int[] arr = {12, 25, 31, 44, 57,63, 78, 81, 95, 103,117, 124, 136, 145, 159,167, 178, 184, 196, 207,215, 228, 239, 247, 259};
        int target=136;
        System.out.println(rangefinder(arr, target));
    }
    static int rangefinder(int[] arr,int t){
        int s=0;
        int e=1;
        while(t>arr[e]){
            int newstart=e+1;
            e=e+(e-s+1)*2;
            s=newstart;
        }
        return search(arr,s,e,t);
    }
    static int search(int[] arr,int s,int e,int t){
        
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<arr[m]){e=m-1;}
            else if(t>arr[m]){s=m+1;}
            else{
                return m;
            }
        }
        return -1;
    }
}
