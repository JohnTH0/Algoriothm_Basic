package chap04;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] queue;

    public IntQueue(int capacity) {
        int num = 0;
        int front = 0;
        int rear = 0;
        int max = capacity;

        try {
            queue = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {}
    }

    public class OverFlowException extends RuntimeException {
        public OverFlowException() {}
    }

    public int enque(int x) throws OverFlowException {
        if (num >= max){
            throw new OverFlowException();
        }
        // 현재 rear에 값이 추가된 이후 rear 값 증가
        queue[rear++] = x;
        num++;
        if (rear == max){
            rear = 0;
        }
        return x;
    }
    public int deque() throws EmptyQueueException {
        if (num <= 0){
            throw new EmptyQueueException();
        }
        int x = queue[front++];
        num --;
        if (front == max){
            front = 0;
        }
        return x;
    }
    public int peek() throws EmptyQueueException {
        if (num <= 0){
            throw new EmptyQueueException();
        }
        return queue[front];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i++){
            int idx = (front + i) % max;
            if (queue[idx] == x){
                return idx;
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

    public int search(int x){
        for (int i = 0; i < num; i++){
            if (queue[( front + i) % max] == x){
                return i + 1;
            }
        }
        return 0;
    }

}
