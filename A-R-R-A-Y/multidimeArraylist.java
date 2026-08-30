import java.util.ArrayList;
import java.util.Scanner;

public class multidimeArraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> mlist=new ArrayList<>();
        for (int i = 0; i < 3; i++) {//initializing the lists inside the list
            mlist.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mlist.get(i).add(in.nextInt());
            }
            System.out.println(" ");
        }

        //print the multi dimentional arraylist
        //1.
        System.out.println(mlist);
        //2.
        for (int j = 0; j < mlist.size(); j++) {
            System.out.println(mlist.get(j));
        }
        
    }
}
