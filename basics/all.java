
import java.util.Scanner;

public class all {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your first number");
        int i1=input.nextInt();
        System.out.print("enter your second number");
        int i2=input.nextInt();

        int i=i1+i2;
        System.out.println("sum of the two numbers are: "+i);
    }
}
