package chap04;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while(true) {
            System.out.println("현재 데이터 수 : " + stack.size() + " / " + stack.capacity());

            System.out.print("(1)push   (2)pop   (3)print (4)exit :");

            int menu = sc.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("stack overflow");
                    }
                    break;
                case 2:
                    try{
                        x = stack.pop();
                        System.out.println("pop data: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("peek data: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}
