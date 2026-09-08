//number of rotation in an sorted rotated array = index of pivot eliment + 1
public class BS_Q11 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
        System.out.println("number of rotation : "+(pivot(arr)+1));
    }

    static int pivot(int[] arr) {
    int s = 0;
    int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1]) {
                return m;
            }

            else if (m > s && arr[m] < arr[m - 1]) {
                return m-1;
            }

            else if (arr[m] <= arr[s]) {
                e = m - 1;
            }

            else {
                s = m + 1;
            }
        }

        return -1;
    }
}
