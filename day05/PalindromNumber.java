package day05;

public class PalindromNumber {
    public static boolean isPalindrome(int x) {
        String name=x+"";
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
        System.out.println(isPalindrome(121));
    }
}
