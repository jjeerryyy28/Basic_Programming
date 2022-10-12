package recursion;

public class ArrayBacktrack {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int x=nums.length-1;
        print(nums, x);
    }
    static void print(int nums[], int x){
        if(x<0){
            return;
        }
        System.out.println(nums[x]);
        print(nums, --x);
    }
}
