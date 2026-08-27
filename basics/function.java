import  java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();
        int s2=sum2();
        System.out.println("sum of the numbers is: "+s2);
        String name=fname("abbhijit","dutta");
        System.out.println(name);

        String gg=swap(3,4);
        System.out.println(gg);

        
    }

    static int sum2(){
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.print("enter first number: ");
        a= input.nextInt();

        System.out.print("enter second number: ");
        b=input.nextInt();

        c=a+b;
        return c;
    }
    static void sum()// here we not returning any thing, because we use void
    {
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.print("enter first number: ");
        a= input.nextInt();

        System.out.print("enter second number: ");
        b=input.nextInt();

        c=a+b;
        System.out.println("sum of the numbers is: "+c);
    }
    
    static String fname(String a,String b){
        String c=a+" "+b;
        return c;
    }

    static String swap(int a, int b){
        int s=a;
        a=b;
        b=s;
        
        
        
        return ("a"+Integer.toString(a)+" "+"b"+Integer.toString(b));
    }
    
}
