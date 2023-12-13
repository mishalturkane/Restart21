package day03;

public class LinearSearch {
    public static String search(int [] arr,int num){
        if (arr == null || arr.length == 0) {
            return "";
        }
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num) {

                count++;
            }

        }
       switch (count){
           case 1:
               System.out.println("number is present");
               break;
           case 2:
               System.out.println("Number is  present in multiple times");
               break;
           default:
               System.out.println("Number is not present");
       }
        return "";
    }
    public static void main(String[] args) {
        int [] arr={};
        search(arr,8);
    }
}
