package week4lab;

public class StackOfIntegers {
    private int elements[];
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity]; //specified by user
        this.size = -1;
    }

    public boolean empty(){
        if (this.size == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public int peek(){
        return this.elements[size]; // top element
    }

    public int pop(){
        int poppedElement = this.elements[size];
        this.size = this.size - 1; //Decrement the index by 1
        return poppedElement;
    }

    public int getSize(){
        return (this.size + 1); //Add 1 as index started from 0
    }

    public void push(int value){
        this.size = this.size + 1; //Increment the index by 1
        this.elements[size] = value; //Add the new value into the new allocated index
    }

    public static void main(String [] args){
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
