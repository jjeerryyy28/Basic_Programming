package recursion;

public class Array {
    static void printArray(int nums[], int index){
        if(index==nums.length){
            return;
        }
        System.out.println(nums[index]);
        printArray(nums, ++index);
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4};
        int x=0;
        printArray(nums, x);
    }
}
