//first and last position of the targeted element in the array
//ex:- arr=[1,2,2,2,3,4,4,4,4,5,6] ,target=4, return [5,8]

import java.util.Arrays;

public class BS_Q5 {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,4,4,4,5,6};
        int target=2;
        int[] range=check(arr, target);
        System.out.println(Arrays.toString(range));
    }
    static int[] check(int[] arr,int t){
        
        int[] re={-1,-1};

        int starting=bin(arr,t,true);
        int ending=bin(arr,t,false);
        re[0]=starting;
        re[1]=ending;
        return re;
    }

    static int bin(int[] arr,int t,boolean firstindex){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(t>arr[mid]){s=mid+1;}
            else if(t<arr[mid]){e=mid-1;}
            else{
                ans=mid;
                if(firstindex){e=mid-1;}
                else{s=mid+1;}
            }
        }
        return ans;
    }
}
