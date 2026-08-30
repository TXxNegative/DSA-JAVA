import java.util.Arrays;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a[];
        a=new int[6];
        // System.out.println(a[0]);// it will give null->it is a special type of litterals.

        System.out.print("eneter your numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=input.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        // for-each loop -> another method to run for loop for every element of the array.
        for(int num:a){
            System.out.println(num+" ");// yaha num represent kar raha hai each elements of the array ko at  one time. 
        }

        // printing array using toString method of Arrays class.
        System.out.println(Arrays.toString(a));

        // passing array in function
        System.out.println(Arrays.toString(a));
        t(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] t(int[] d){
        d[3]=86;
        return(d);
    } 

}
