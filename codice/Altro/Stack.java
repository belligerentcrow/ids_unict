package Altro;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

class Stack<T>
{
    private int top, size;
    private T[] stack; 
    private String type; 

public Stack (int size){
    this.top = 0; 
    this.size = size; 
    this.stack (T[]) new Object[size];
}

public void push (T item) throws StackOverflowException{
    if (this.is_full())throw new StackOverflowException(this);
    this.stack[this.top++] = item; 
}

public T pop ()throws StackUnderflowException{
    if(this.is_empty()) throw new StackUnderflowException(this);
    return this.stack[--this.top];
}
    public boolean is_empty(){return this.top== 0;}
    public boolean is_full(){return this.top == this.size;}

    public static void  main (String []args){
        Stack s = new Stack<Integer>[size];
        Stack<Integer> s1 = new Stack<Integer>(size);
        Stack<String> s2 = new Stack<String>(size);
    }
}