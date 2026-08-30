//searching in 2D array

import java.util.Scanner;

public class L_Q3 {
    public static void main(String[] args) {
        int[][] tda={{1,2,3},{4,5},{6,7,8,9}};
        Scanner in=new Scanner(System.in);
        System.out.print("enter the target: ");
        int target=in.nextInt();
        int[] v=tdsearch(tda, target);
        if(v[0]==-1 && v[1]==0){
            System.out.println("2D array is empty");
        }
        else if(v[0]==0 && v[1]==0){
            System.out.println("element not in 2D array");
        }
        else{
            System.out.println("element at position: "+v[0]+"x"+v[1]);
        }
    }

    static int[] tdsearch(int[][] tda,int target){
        int[] r=new int[2];
        if(tda.length==0){
            r[0]=-1;r[1]=0;
            return r;
        }
        for(int i=0;i<tda.length;i++){
            for(int j=0;j<tda[i].length;j++){
                if(tda[i][j]==target){
                    r[0]=i;r[1]=j;
                    return r;
                }
            }
        }
        r[0]=0;r[1]=0;
        return r;
    }
    
}
