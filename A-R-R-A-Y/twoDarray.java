import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        int arr2d[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        Scanner input=new Scanner(System.in);
        /* 
        int[][] arr2d1 = new int[3][4];
        for(int i=0;i<arr2d1.length;i++){
            for (int j = 0; j < arr2d1.length; j++) {
                System.out.print("enter number for position "+i+"x"+j+" :");
                arr2d1[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<arr2d1.length;i++){
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d1[i][j]+" ");
            }
            System.out.println("");
        }

        int[][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[3];
        arr[2]=new int[3];

        arr=arr2d;
        for(int[] row:arr){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }

        //dynamic array
        int[][] arr1={{1,2,3},{4,5},{6,7,8,9}};
        */

        //dynamic array each row size is initialized separately
        int[][] arr2=new int[3][];
        arr2[0]=new int[3];
        arr2[1]=new int[2];
        arr2[2]=new int[4];

        // crooked way to inserting data into an array
        int r = 0;

        for (int[] row : arr2) {
            int c = 0;

            for (int col : row) {
                System.out.print("Enter arr2[" + r + "][" + c + "] : ");
                row[c] = input.nextInt();
                c++;
            }

            r++;
            System.out.println();
        }

        for(int[] row:arr2){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
    

}
