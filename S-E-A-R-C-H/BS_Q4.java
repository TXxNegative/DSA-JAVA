//smallest char -> same as smakkest number question in BS_Q3.java file.
public class BS_Q4 {
    public static void main(String[] args) {
        char[] arr={'b','c','d'};
        char t='a';
        System.out.println(arr[smallestChar(arr, t)]);
    }
    static int smallestChar(char[] arr,int t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(t>(int)arr[m]){s=m+1;}
            else if(t<(int)arr[m]){e=m-1;}
            else{
                if(e==arr.length-1){return 0;}//insted of e we can also compare with m.
                else{return m+1;}
            }
        }
        if(e==arr.length-1){return 0;}
        else{return s;}
    }

    //easy method
    static char juju(char[] arr,char t){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<(int)arr[m]){e=m-1;}
            else{s=m+1;}
        }
        return arr[s%arr.length];
    }
}
