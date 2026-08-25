import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// system.in means take input from keyboard
        
        String gg=input.nextLine();// nextLine will take string from keyboard
        System.out.println(gg);//in println ln is for new line
        System.out.println("your number is "+input.nextInt());// nextInt will take int from keyboard as input

        //permitive data type
        int roll=12;//4 bytes
        char letter='s';//8 bytes
        float marks=39.45f;//4 bytes, by default every decimal in  java in double value, so for assign float we need to add f at the end
        double largedecimal=2323.3424;//8 bytes
        long largeint=23324545234L;//8 bytes
        boolean check=true;

        int a=10;//here 10 is the litterals and a is the identifier, any name of the class, variable , objects, function is identifier
    }
}






