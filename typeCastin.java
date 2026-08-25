
import java.util.Scanner;

public class typeCastin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num=input.nextInt();// since we giving int as input and storing in float there is no problem it ,here automatically converting in to the float while assigning the value to the variable ,(here automatically type of the value is changing ) int<float

        //type casting
        int n=(int)(67.66f);
        System.out.println(n);

        //automatic type promotion in expression
        int a=257;
        byte b=(byte)(a);// here the output will be 257 % 256 = 1

        byte b1=40;
        byte b2=50;
        byte b3=100;
        int d=(b1*b2)/b3;// here the value of b1*b2 is 2000 which is impossible to store in byte data type , so java automatically promote the result into int type.
        System.out.println(d);

        /* 
        byte b4=50;
        b4=b4*2;// this is wrong because after b4*2 execution the value automaticaly propmoted to int so we can no more store the value in byte b4.
        */

        int number='a';
        System.out.println(number);// it will give 97 as output because


    }
}
