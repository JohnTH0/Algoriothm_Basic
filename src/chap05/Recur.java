package chap05;

import java.util.Scanner;

/*
    상향식 분석과 하향식 분석은 보는 관점에 따라 다름
    하향식: 처음 대입되는 값부터 확인진행, 위에서 아래로
    상향식: 더 이상 출력할 수 없는 경우, 해당 위치부터 위로 진행
 */
public class Recur {
    static void recur(int n){
        if (n > 0){
            recur(n-1);
            System.out.printf("실행되는 함수: recur( %d " + ")\n", n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();

        recur(n);
    }
}
