import java.util.Scanner;
public class peime_fun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        System.out.println(prime(k));
        System.out.println(prime_while(k));
    }

    static String prime(int num){
        if(num<=1){
            return "enter new number";
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return ("the number is not prime");
            }
        }
        return "number is prime";
    }

    static String prime_while(int n){
        if(n<=1){
            return "enter valid number";
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return "not a prime using while";
            }
            i++;
        }
        return "number is prime using while";
    }
}
//break → stops only the loop, then continues with the code after the loop.
//return → stops the loop + the entire method.

