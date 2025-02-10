package chap05;

import chap04.IntStack;

import java.util.Scanner;

public class Exam04 {
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }
    static void recur3(int n){
        while(n > 0){
            recur3(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();

//        recur2(n);
//        recur3(n);
        recur4(n);

    }

    // Stack을 사용한 재귀호출 제거
    static void recur4(int n){
        IntStack stack = new IntStack(n);

        while(true){
            if(n > 0){
                stack.push(n);
                n = n - 1;
                System.out.println("After Push stack Peek : " + stack.peek());
                continue;
            }
            if (!stack.isEmpty()) {

                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                if (!stack.isEmpty()) {
                    System.out.println("After Pop stack Peek : " + stack.peek());
                }
                continue;
            }
            break;
        }
    }
}
