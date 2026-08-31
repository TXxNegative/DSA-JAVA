public class L_Q4 {
    public static void main(String[] args) {
        int[] arr={12,1,34,456,55555,74,152,55};
        System.out.println("number of elemet with even digits are: "+evenlen(arr));
        System.out.println("number of elemet with even digits are: "+evenlen2(arr));
        System.out.println("number of elemet with even digits are: "+evenlen3(arr));
    }
    //easy method using string length
    static int evenlen(int[] arr){
        int n=0;
        for(int i=0;i<arr.length;i++){
            if((Integer.toString(arr[i])).length()%2==0){
                n=n+1;
            }
        }
        return n;
    }

    //using hard method
    static int evenlen2(int[] arr){
        int[] clone=arr.clone();// this will assign exact array elements to the clone array of the arr array.agar hum yaha clone array mai change karenge to wo global arr array mai koi change nahi karega,change bas clone array pe hoga.
        int n=0;
        for(int i=0;i<clone.length;i++){
            int count=0;
            while(clone[i]>0){
                count=count+1;
                clone[i]=clone[i]/10;
            }
            if(count%2==0){n=n+1;}
        }
        return n;
    }

    //not using clone method of array
    static int evenlen3(int[] arr){
        int n=0;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            int count=0;
            while(val>0){
                count=count+1;
                val=val/10;
            }
            if(count%2==0){n=n+1;}
        }
        return n;
    }
}
