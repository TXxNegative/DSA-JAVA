public class scope {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a); //20
        int b=30;
        {
            a=45;// here we change the value otside, just like for loop
            System.out.println(a);//45
            int c=67;
        }
        System.out.println(a);//45
        //System.out.println(c);// this will give error c is inside block
    }
}
