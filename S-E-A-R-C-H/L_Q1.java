import java.util.Scanner;

public class L_Q1 {
    public static void main(String[] args) {
        String str="hello nigga";
        Scanner in=new Scanner(System.in);
        System.out.print("enter the char to search: ");
        char cha=in.next().charAt(0);
        System.out.println(search(str,cha));
    }
    
    static String search(String s,char cha){
        if(s.length()==0){
            return "length os array is 0";
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==cha){
                return " char at position : "+i;
            }
        }
        return "not in array mf";
    }
}
