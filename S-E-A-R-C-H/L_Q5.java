public class L_Q5 {
    public static void main(String[] args) {
        int[][] arr={{2000,3000},{400,500,90}};
        System.err.println("maximum toatal welth is: "+maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        int more=0;
        for(int person=0;person<accounts.length;person++){
            int sum_welth=0;
            for(int bank=0;bank<accounts[person].length;bank++){
                sum_welth=sum_welth+accounts[person][bank];
            }
            if(sum_welth>more){more=sum_welth;}
        }
        return more;
    }
}
