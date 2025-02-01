package chap01;

import java.util.Scanner;

public class exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        do {
            a = sc.nextInt();
            if (a < 0){
                System.out.println("0보다 큰 값을 입력하세요");
            }
        } while (a < 0);
        int aLength = String.valueOf(a).length();
        System.out.println("그 수는 " + aLength + "자리입니다");
    }
}
