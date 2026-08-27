import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int g=input.nextInt();
        System.out.println(armstrong_num(g));
    }
    static boolean armstrong_num(int n){
        int original= n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==original;
    }
}
