package recursion;

public class PrintStringCharacter {
    public static void main(String[] args){
    String s1 = "Hello";
    int x =0;
    Print(x,s1);
    }
    static void Print(int x, String s){
        if(x==s.length()){
            return;
        }
        System.out.println(s.charAt(x));
        Print(++x, s);
    }
}
