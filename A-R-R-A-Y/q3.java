//reversing an array using swap method
import java.util.Arrays;
public class q3 {
    public static void main(String[] args) {
        int[] list={12,34,56,34,23,1253,65};

        System.out.println(Arrays.toString(list));
        reverse(list);
        System.out.println(Arrays.toString(list));
    }

    static void reverse(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            swap(arr,s,e);
            s=s+1;
            e=e-1;
        }
    }

    static void swap(int[] arr,int s,int e){
        int val=arr[s];
        arr[s]=arr[e];
        arr[e]=val;
    }
}
