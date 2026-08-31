public class order_agonistic_B_S2{
    public static void main(String[] args) {
        int[] arr = {60, 50, 40, 30, 20, 10};
        System.out.println(binarySearch(arr, 40));
    }

    static int binarySearch(int[] arr, int target) 
    {
        int start = 0;
        int end = arr.length - 1;
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (ascending) {

                // Ascending order
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }

            } else {

                // Descending order
                if (target < arr[middle]) 
                {
                    start = middle + 1;
                } 
                else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}