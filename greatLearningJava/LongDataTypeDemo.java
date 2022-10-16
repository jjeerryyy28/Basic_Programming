package greatLearningJava;

public class LongDataTypeDemo {
    public static void main(String[] args){
        long num = 1234569656L;
        System.out.println(num);
        char ch = 'A';
        System.out.println(ch);
        int tempCh = (int) ch;
        System.out.println(tempCh);
        tempCh += 2;
        ch = (char) tempCh;
        System.out.println(ch);
    }
}
