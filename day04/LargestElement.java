package day04;

public class LargestElement {
    public static int  largestEle(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
           if(x>max)
               max=x;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={1,2,66,3,4,5};
        System.out.println(largestEle(arr));
    }
}
