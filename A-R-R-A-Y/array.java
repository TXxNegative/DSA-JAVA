public class array {
    public static void main(String[] args) {
        
        //syntax-1
        int[] arr=new int[]{3,4,5,6,7};
        
        //syntax-2
        int arr1[]=new int[5];
        arr1=new int[]{4,5,6,7,8};

        //syntax-3
        int[] arr2={1,2,3,4,5,6,76};
        
        //syntax-4
        int arr3[]=new int[]{4,5,6,7,8};

        //working
        int[] a;//yaha hum refferenec var create kar rahe hai jo ki compilation ke time hota hai
        a=new int[5];// ye runtime me kaam karta hai, ye object create kar raha hai heap memory mai. ye dynamic memory allocation hai

    }
}
