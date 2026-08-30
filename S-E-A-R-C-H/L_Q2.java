//search in range
import java.util.Arrays;
import java.util.Scanner;

public class L_Q2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int[] arr={177,12,34,56,34,23,1253,65,76};
        System.out.println(Arrays.toString(arr));
        System.out.print("enter the number: ");
        int target=input.nextInt();
        System.out.print("enter the starting of the range: ");
        int start=input.nextInt();
        System.out.print("enter the ending of the range: ");
        int ending=input.nextInt();

        int val=range(arr, start, ending, target);
        switch(val){
            case(-1)->System.out.println("length of array is 0");
            case(1)->System.out.println("element not found in range");
            default->System.out.println(val);
        }

    }

    static int range(int[] arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return 1;
    }
}