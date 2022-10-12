package hashSet;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
// import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        sc.close();
        Set<Integer> s = new HashSet<>();
        for(Integer a:num){
            if(s.add(a)==false){
                System.err.println("Found duplicate element in array: "+a);
            }
        }
    }
}
