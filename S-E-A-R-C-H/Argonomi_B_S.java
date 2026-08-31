import java.util.Scanner;

public class Argonomi_B_S {
    public static void main(String[] args) {
        int[] ascarr={1,3,33,34,45,57,61,89};
        int[] desarr={90,85,63,61,54,41,40,7};
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();

        System.out.println(finding(desarr, target));
        
        
    }
    static int ascbinsea(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            int m=s+(e-s)/2;
            if(target<arr[m]){e=m-1;}
            else if(target>arr[m]){s=m+1;}
            else{return m;}
        }
        return -1;
        
    }

    static int desbinsea(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target>arr[m]){e=m-1;}
            else if(target<arr[m]){s=m+1;}
            else{return m;}
        }
        return -1;
            
    }
    static String finding(int[] arr,int target){
        if(arr[0]<arr[arr.length-1]){
            int a=ascbinsea(arr, target);
            System.out.println("the array is ascending.");
            if(a==-1){
                return ("element not in array");
            }
            else{
                return("element at position: "+a);
            }
        }
        else{
            int a=desbinsea(arr, target);
            System.out.println("the array is descending.");
            if(a==-1){
                return ("element not in array");
            }
            else{
                return("element at position: "+a);
            }
        }
    }
}
