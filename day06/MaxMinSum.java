package day06;

public class MaxMinSum {
    public static int findSum(int A[],int N) {
        //code here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int x:A){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        return min+max;


    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(findSum(arr,5));
    }
}
