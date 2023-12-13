package day02;

import java.util.Arrays;

public class ReversArray {
    public static  void reverse(int [] arr){

        /**with temp variable*/

//        int start=0;
//        int temp;
//        int end= arr.length-1;
//        while(start<end){
//             temp =arr[end];
//            arr[end]=arr[start];
//            arr[start]=temp;
//            start++;
//            end--;
//        }
        /**withought temp variable*/
        int start=0;
        int end= arr.length-1;
        while(start<end){
           arr[start]=arr[start]+arr[end];
           arr[end]=arr[start]-arr[end];
           arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
