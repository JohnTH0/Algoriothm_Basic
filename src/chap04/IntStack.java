package chap04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stack;

    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try {
            stack = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr == max) {
            throw new OverflowIntStackException();
        }
        return stack[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stack[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stack[ptr - 1];
    }

    public int indexOf(int x) throws EmptyIntStackException {
        for (int i = 0; i < ptr; i++) {
            if (stack[i] == x){
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("Stack is empty");
        } else{
            for (int i = 0; i < ptr; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

}
