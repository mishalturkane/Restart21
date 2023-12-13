package day04;

public class DuplicateEle {
    public static int  dupliEle(int [] arr){
        int count=0;
         for(int i=0;i< arr.length;i++){
             for(int j=0;j< arr.length;j++){
                 if(arr[i]==arr[j]){
                   count=1;
                   break;
                 }
             }
         }
         if(count==1){
             return 1;
         }
         else {return -1;}
    }
    public static void main(String[] args) {
        int [] arr={4,3,45,5,6,7,5,4};
        System.out.println(dupliEle(arr));
    }
}
