package recursion;

public class PrintStringReverse {
    public static void main(String[] args) {
        String s="hello";
        int x = s.length()-1;
        print(x,s);
    }
    private static void print(int x, String s) {
        if(x<0){
            return;
        }
        System.out.println(s.charAt(x));
        print(--x, s);
    }
}
