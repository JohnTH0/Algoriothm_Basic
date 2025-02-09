package chap04;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while(true) {
            System.out.println("현재 데이터 수 : " + stack.size() + " / " + stack.capacity());

            System.out.print("(1)push   (2)pop   (3)print (4)search (5)info (6)clear (7)dump (0) end");

            int menu = sc.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                // push
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("stack overflow");
                    }
                    break;
                // pop
                case 2:
                    try{
                        x = stack.pop();
                        System.out.println("pop data: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                // peek
                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("peek data: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                // indexOf
                case 4:
                    System.out.print("find data：");
                    int num = sc.nextInt();
                    x = stack.indexOf(num);
                    if (x >= 0){
                        System.out.println("point: " + (stack.size() - x));
                    } else{
                        System.out.println("value not found");
                    }
                    break;
                // Info
                case 5:
                    System.out.println("capacity: " + stack.capacity());
                    System.out.println("Data count: " + stack.size());
                    break;
                // clear
                case 6:
                    stack.clear();
                    break;
                // dump
                case 7:
                    stack.dump();
                    break;
            }
        }
    }
}