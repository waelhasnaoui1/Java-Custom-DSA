public class MyStack {

    private int[] stack;
    private int size;

    MyStack(int size) {
        stack = new int[size];
        size = size;
    }

    public void push(int element){
        if (size == stack.length){
            System.out.println("Stack is full you cannot add more elements !");

        }
        for (int i = size - 1; i >= 0; i--) {
            stack[i + 1] = stack[i];
        }

        stack[0] = element;
        size++;

    }

    public int peek(){
        if (size == 0){
            throw new IllegalStateException("Stack is empty, no elements to peek");
        }
        return stack[0];
    }

    public int pop(){
        if (size == 0) {
            throw new IllegalStateException("Stack is empty, no elements to pop!");
        }

        int topElement = stack[0];


        for (int i = 1; i < size; i++) {
            stack[i - 1] = stack[i];
        }

        size--;
        return topElement;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }


}
