package hashSet;

import java.util.ArrayList;
// import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
// import java.util.Set;

public class DissappearedNumberInArray {
    public static List<Integer> missingNum(int[] nums){
        int temp[]=new int[nums.length+1];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]=nums[i];
        }
        for(int i=1;i<=temp.length-1;i++){
            if(temp[i]==0){
                list.add(i);
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(missingNum(nums));

    }
}
