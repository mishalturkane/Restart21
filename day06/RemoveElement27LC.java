package day06;

public class RemoveElement27LC {
    public static    int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to maintain non-equal elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        }
        for(int x: nums){
            System.out.print(x+" ");
        }
        System.out.println();
        return k;  // Returning the count of elements not equal to val
    }
    public static void main(String[] args) {
        int [] arr={3,2,2,3};
        System.out.println( removeElement(arr,3));
    }
}
