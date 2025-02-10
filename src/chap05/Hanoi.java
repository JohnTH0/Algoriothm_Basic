package chap05;

import java.util.Scanner;

public class Hanoi {
    static void move(int n, int from, int to) {
        if (n > 1) {

            move(n - 1, from, 6 - from - to);
        }
        System.out.println("원반[" + n + "]을 " + from + "기둥에서 " + to + "기둥으로 옮김");

        if (n > 1) {
            move(n - 1, 6 - from - to, to);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이 탑");
        System.out.print("원반 개수: ");
        int n = sc.nextInt();
        move(n, 1, 3);
    }

}

