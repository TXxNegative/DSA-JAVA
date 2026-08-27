import java.util.Arrays;

public class funoverloading {
    public static void main(String[] args) {
        fun(45);//it happens during compilation , during compilation decision is made which function to call according to the arguement we are passing(based on type of arguements, no. of arguements)
        System.out.println(fun(1,2,3,4,5,6));

        fun();// without passing arguement call is possible with normal parameter functions

        //doom(); // in variale length parameter function calling that function without passing a arguement will give error

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    } 

    static int fun(int a,int b){
        return a+b;
    }

    static String fun(int ...v){
        String k=Arrays.toString(v);
        return k;
    }

    static void doom(int ...v){
        String d=Arrays.toString(v);
        System.out.println(d);
    }
    
    static void doom(String ...v){
        String d=Arrays.toString(v);
        System.out.println(d);
    }
}
