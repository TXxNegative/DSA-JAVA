import java.util.Arrays;
import java.util.Scanner;
public class pass_by_var {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
        
        System.out.println(num(20));
        
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    //in java we pass by variable

    static int num(int n){// yaha n=i hai, matlab n and i dono eak value/object (20) ke taraf point kar rahe hai jo ki heap memory mai hai.
        n=30; //yaha hamne heap memory me naya object/value insert kia (30) then n ko uske taraf point kar dia, i abhi bhi (20) ko hi point kar raha hai.
        return n;
    }
    
    static void change(int[] a){// yaha a=arr hai, a and arr dono [1,2,3,4,5,6] ke taraf point kar rahe hai jo ki heap memory mai hai
        a[0]=99; //yaha ham bas arr ki eak value change kar hai lekin a and arr dono hi abhi bhi [1,2,3,4,5,6] ke taraf point kar rahe hai bas arr ka eak value change hua hai [99,2,3,4,5,6].
    }

}
