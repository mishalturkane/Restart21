package day06;

public class ReverseString {
    public static String reverseWord(String str)
    {
        // Reverse the string str
       StringBuffer strbf=new StringBuffer();

       for(int i=str.length()-1;i>=0;i--){
           strbf.append(str.charAt(i));
       }
        return strbf.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Geeks"));
    }

}
