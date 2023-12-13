package day04;

public class ArraySum {
    public static int  sum(int [] arr){
        int sum=0;
        for(int x:arr){
            sum=x+sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(sum(arr));
    }
}
