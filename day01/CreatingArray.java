package day01;

public class CreatingArray {
    public static  void createArray(){
        int [] arr={1,2,3,4,5};
       for(int x: arr){
           System.out.print(x+" ");
       }
    }

    public static void main(String[] args) {
        createArray();
    }
}
