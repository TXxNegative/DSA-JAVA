//split the array in two(m) parts for getting the smallest value by summing the elements of each array among the all values other splits possible
//array dont have -ve value

//ex:- [7,2,5,10,8] m=2, 
// here m is the number of sub arrays we have to form
// case-1: split1=[7,2,5,10], split2=[8], 7+2+5+10=24 ,8=8
// case-2: split1=[7,2,5], split2=[10,8], 7+2+5=14 ,10+8=18.
//case-3: split3=[7,2], split2=[5,10,8], 7+2=9 ,5+10+8=23.
//case-4: split1=[7], split2=[2,5,10,8], 7=7 ,2+5+10+8=25.
//24>8 =24 , 18>14=18 , 23>9=23 , 25>7=25
//18 < 24,23,25 therefore return 18

//there are 4 more ways to split the array but this will give the biggest value
// the order of the arr must be unchanged
public class BS_Q12 {
    public static void main(String[] args) {
        int[] arr={12,32,2,21,45,6,78,90,10};
        int[] arr1={7,2,5,10,8};
        int m=2;
        System.out.println(splitarray(arr1, m));
    }
    static int splitarray(int[] nums,int m){
        int s=0;
        int e=0;

        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);//in the end of the loop this will contain the max item from the array.
            e=e+nums[i];
        }

        while(s<e){
            //try middle as potential ans
            int mid=s+(e-s)/2;
            //calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    //you cant add this in this sub array, make new array
                    //say you add this num in new subarray, then sum=num
                    sum=num;
                    pieces++;
                }
                else{sum+=num;}
            }
            if(pieces>m){
                s=mid+1;
            }
            else{e=mid;}
        }
        return e;//here s==e
    }
}
