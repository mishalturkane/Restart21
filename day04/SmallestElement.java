package day04;

public class SmallestElement {
    public static int  smallEle(int [] arr){
        int max=Integer.MAX_VALUE;
        for(int x:arr){
            if(x<max)
                max=x;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={1,2,66,3,4,5};
        System.out.println(smallEle(arr));
    }
}
