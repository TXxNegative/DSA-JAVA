import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] arr={2,43,5,4,6,7,45,1,12,44};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                }
            }
        }
    }
}