package Overriden;

public class Main {
    public static void main(String[] args) {
        Parent a;

        a=new SubClass1();
        a.Print();
        a = new  SubClass2();
        a.Print();
        
    }
}
