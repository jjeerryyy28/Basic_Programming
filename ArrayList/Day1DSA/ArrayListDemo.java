package ArrayList.Day1DSA;

import java.util.ArrayList;
import java.util.Collections;

// import java.util.*;//(adds additional class which creates blunders, not recommended)

public class ArrayListDemo {
    public static void main(String[] args) {
        //Integer | Float | String | Boolean
        ArrayList<Integer> al = new ArrayList<>();
        // ArrayList<String> al2 = new ArrayList<>();
        // ArrayList<Float> al3 = new ArrayList<>();
        // ArrayList<Boolean> al4 = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        
        //get elements
        int elements=al.get(0);
        System.out.println(elements);
        al.add(2, 40);
        System.out.println(al);

        //set elements
        al.set(0,50);
        System.out.println(al);

        //delete elements
        al.remove(3);
        System.out.println(al);

        //size
        int size=al.size();
        System.out.println(size);

        //loops
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(al);
        System.out.println(al);
    }
}
