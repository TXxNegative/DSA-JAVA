public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x=40;//only after intializing the value of x here this  will shadow the value of global x that we initialize at line 2
        System.out.println(x);
    }
}
