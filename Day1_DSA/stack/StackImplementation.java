package Day1_DSA.stack;

public class StackImplementation {
    static final int stack_size = 1000;
    int current_pointer;
    int a[] = new int[stack_size];

    StackImplementation(){
        current_pointer = -1;
    }

    boolean push(int x){
        if(current_pointer>=(stack_size-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++current_pointer] = x;
            System.out.println(x+" pushed in Stack");
            return true;
        }
    }

    int pop(){
        if(current_pointer<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[current_pointer--];
            return x;
        }
    }

    void printStack(){
        for(int i=current_pointer;i>-1;i--){
            System.out.print(" "+a[i]);
        }
    }
}


class Main{
    public static void main(String[] args) {
        StackImplementation si = new StackImplementation();
        si.push(32);
        si.push(0);
        si.push(10);
        si.push(140);
        si.push(12);
        System.out.println(si.pop()+" popped from Stack");
        System.out.println(si.pop()+" popped from Stack");
        System.out.println(si.pop()+" popped from Stack");
        System.out.print("Elements present is Stack:");
        si.printStack();
        System.out.println();
        System.out.println(si.pop()+" popped from Stack");
        System.out.println(si.pop()+" popped from Stack");
        System.out.println("elements present in stack: ");
        si.printStack();
    }
}