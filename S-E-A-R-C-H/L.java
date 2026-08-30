//LINEAR SEARCH

import java.util.Arrays;
import java.util.Scanner;
public class L {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int[] arr={177,12,34,56,34,23,1253,65,76};
        System.out.println(Arrays.toString(arr));
        System.out.print("enter the number: ");
        int target=input.nextInt();
        int val=lin_sea(arr, target);
        switch(val){
            case(-1)->System.out.println("length of array is 0");
            case(1)->System.out.println("element not found in array");
            default->System.out.println(val);
        }
    }

    static int lin_sea(int[] arr,int t){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t) return i;
        }
        return 1;
    }

}
