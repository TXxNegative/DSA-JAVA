//smallest number ->
//1. give the number which is just greater than target value.
//2. if the target value is in the array but at last index then return the first value of the array
//3. if the target value is not in the array but biggest among the all numbers in the array then return the first element of the array.
public class BS_Q3 {
    public static void main(String[] args) {
        int[] arr={3, 7, 12, 18, 24, 31, 39, 45, 52, 61, 68, 75, 83, 91, 100};
        int target=15;
        System.out.println(arr[smallestLetter(arr, target)]);
    }

    static int smallestLetter(int arr[],int t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(t>arr[m]){s=m+1;}
            else if(t<arr[m]){e=m-1;}
            else {
                if(m==arr.length-1){return 0;}
                else {return m+1;}
            }
        }
        if(e==arr.length-1){return 0;}
        else{return s;}
    }
}
