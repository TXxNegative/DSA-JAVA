
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        multiargs(23, 34, 34,45,64,34,623,4);
    }

    static void fun(int ...v){// here we assigning not fix number of arguements.
        System.out.println(Arrays.toString(v));
    }

    static void multiargs(int a,int b,int ...c ){// variable lenghth arguement must be at the end
        System.out.println(a+" "+b+Arrays.toString(c));

    }
}
