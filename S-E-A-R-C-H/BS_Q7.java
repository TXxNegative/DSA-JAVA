//mountain array|biotonic array -> a array where the array starting ascendingly then after an element(peak element) the array start follow descending order.
//it dont have duplicate element
//ex:- [12,24,36,44,55,69,54,32,10,1]
//Q. find the peak element of the array.
public class BS_Q7 {
    public static void main(String[] args) {
        int[] arr={12,24,36,44,55,69,54,32,10,1};
        int[] arr1 = {2, 5, 8, 17, 21, 18, 14, 9, 6, 3};
        System.out.println(peak(arr1));
        System.out.println(peak1(arr1));
    }
    // my way
    //in my way there is problem when m==0 & m==arr.length-1. it will give out of range error.
    static int peak(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m-1]&&arr[m]>arr[m+1]){
                return m;
            }
            else if(arr[m]<arr[m+1]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
    //optimal way
    static int peak1(int[] arr){
        int s=0;
        int e=arr.length-1;

        while (s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1]){
                //this condition means you are in descending part of the array
                //this means m can be the answear ,but also check left
                //this is why end !=mid-1
                e=m;
            }
            else{
                //this condition means you are in ascending part of the array
                s=m+1; //because we know that mid+1 element > mid element
            }
        }
        //in the end ,s==e and pointing to the largest number in the arr because of the two checks above
        //s and e are always try to find max element in the above two checks
        //hence when they are pointing to just one element ,that is the max one because thats what the checks say
        //at every point of time for s and e they hsve the best possible ans till that time,and if we are saying that only one elment is remaining hence cause of above line that is the best possible answear .
        return e; //return s; because both are pointing toward same element
    }
}
