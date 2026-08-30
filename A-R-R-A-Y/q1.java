//swaping two index element of an array
import java.util.Arrays;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        int[] list={12,34,56,34,23,1253,65,76};

        Scanner in=new Scanner(System.in);
        System.out.print("enter the 1st index");
        int j=in.nextInt();
        System.out.print("enter the 2nd index");
        int k=in.nextInt();

        System.out.println(Arrays.toString(list));
        swap(list,j,k);
        System.out.println(Arrays.toString(list));
    }

    static void swap(int[] arr,int a,int b){
        int val=arr[a];
        arr[a]=arr[b];
        arr[b]=val;
    }
}
