package day01;

import java.util.Arrays;

public class MaxAndMin {
    public static String find1(int [] arr){
        Arrays.sort(arr);

        return "Min element is="+arr[0]+"\nMax element is="+arr[arr.length-1];
    }
    public static String find2(int [] arr){
        if (arr == null || arr.length == 0) {
            return "Array is empty.";

        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int x:arr){
            if(x>max){
                max=x;
            }
            else if(x<min){
                min=x;
            }
        }
        return "Min is="+min+" Max is="+max;
    }
    public static void main(String[] args) {
        int [] arr={3,4,2,1,5};
        System.out.println(find2(arr));

    }
}
