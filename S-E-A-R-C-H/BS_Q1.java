//find the ceiling value -> find the greatest number in the array which is equal or greater than the target value 
public class BS_Q1 {
    public static void main(String[] args) {
        int[] ascarr={1,3,33,34,45,57,61,89};
        int target=10;
        System.out.println(ceiling(ascarr, target));//since target not in array so it will return the just greater than target value
    }
    
    //best way
    static int ceiling(int[] arr,int t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(t>arr[m]){s=m+1;}
            else if(t<arr[m]){e=m-1;}
            else return m;
        }
        return s;
    }
}
