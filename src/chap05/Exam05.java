package chap05;

import chap04.IntStack;

import java.util.Scanner;

/*
    상향식 분석과 하향식 분석은 보는 관점에 따라 다름
    하향식: 처음 대입되는 값부터 확인진행, 위에서 아래로
    상향식: 더 이상 출력할 수 없는 경우, 해당 위치부터 위로 진행
 */
public class Exam05 {
    static void recur(int n){
        if (n > 0){
            recur(n-1);
            System.out.printf("실행되는 함수: recur( %d " + ")\n", n-1);
            System.out.println(n);
            recur(n-2);
        }
    }
    static void recur3(int n){
        IntStack stack = new IntStack(n);
        stack.push(n);
        while(!stack.isEmpty()){
            int cur = stack.peek();
            if(cur > 0 ){
                stack.push(cur-1);
                stack.push(cur-2);
            }else{
                stack.pop();
                if (!stack.isEmpty() && stack.peek() == cur - 1) {
                    System.out.print(cur + " ");
                }
            }
        }
    }
    static void recur4(int n){
        if (n > 0){
            recur4(n-1);
            recur4(n-2);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();

//        recur(n);
        recur3(n);
//        System.out.println();
//        recur4(n);
    }
}
