package hashset;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        s.add(10);
        s.add(180);
        s.add(240);
        System.out.println(s);

        for(Integer r: s){
            System.out.println(r);
        }
        s2.addAll(s);
        s2.add(100);
        System.out.print("Value of s2: "+s2);
        System.out.println();
        s3.addAll(s2);
        s3.add(100);
        s3.add(240);
        System.out.print("value of s3: "+s3);
        
    }
}
