//find max in array

public class q2 {
    public static void main(String[] args) {
        int[] list={12,34,56,34,23,1253,65,76};
        System.out.println("maximum number is "+max(list));

    }
    static int max(int[] arr){
        int k=0;
        for (int elem : arr) {
            if(elem>k) k=elem;
        }
        return k;
    }
}
