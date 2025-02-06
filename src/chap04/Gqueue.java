package chap04;

public class Gqueue<E> {
    private int max;        // 큐의 용량
    private int num;        // 현재 데이터 수
    private int front;      // 프론트 커서
    private int rear;       // 백 커서
    private E [] queue;     // 큐

    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() {
        }
    }

    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() {
        }
    }

    public Gqueue(int capacity) {
        num = 0;
        front = 0;
        rear = 0;
        max = capacity;
        try {
            queue = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enqueue(E element) throws OverflowGqueueException {
        if (num >= max) {
            throw new OverflowGqueueException();
        }
        queue[rear++] = element;
        num++;
        if (num == max) {
            num = 0;
        }
        return element;
    }

    public E dequeue() throws EmptyGqueueException {
        if (num <= 0) {
            throw new EmptyGqueueException();
        }
        E element = queue[front];
        num--;
        if (rear == max) {
            rear = 0;
        }
        return element;
    }

    public E peek() throws EmptyGqueueException {
        if (num <= 0) {
            throw new EmptyGqueueException();
        }
        return queue[front];
    }

    public int indexOf(E element) {
        for (int i = 0; i < num; i++) {
            if(queue[(front + i) % max].equals(element)) {
                return front + i;
            }
        }
        return -1;
    }

    public int search(E element) {
        for (int i = 0; i < num; i++) {
            if(queue[(front + i) % max].equals(element)) {
                return i + 1;
            }
        }
        return -1;
    }
    public void clear(){
        front = 0;
        rear = 0;
        num = 0;
    }
    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if (num <= 0){
            System.out.println("Queue is empty");
        }
        for (int i = 0; i < num; i++){
            System.out.print(queue[( front + i) % max] + " ");
        }
        System.out.println();
    }
}
