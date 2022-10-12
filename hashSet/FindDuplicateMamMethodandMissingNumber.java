package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateMamMethodandMissingNumber {
    public static void main(String[] args) {
        int nums[]={1,2,2,3,4};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }   
}
