package day02;

public class CheckPalindrom {
  public static  boolean checkPali(String input){
      String name=input;
      int start=0;
      int end=name.length()-1;
      while(start<=end){
          if(name.charAt(start)==name.charAt(end)){
              start++;
              end--;

          }
          else break;
      }
      if(start<end){
          return false;
      }
      return true;

  }

    public static void main(String[] args) {
        System.out.println(checkPali("123121"));
    }
}
