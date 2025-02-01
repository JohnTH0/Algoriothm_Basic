package chap01;

import java.util.Scanner;

public class exam10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b <= a){
                System.out.println("a보다 큰 값을 입려하세요");
            }
        } while (b <= a);

        System.out.println("a의 값:" + a);
        System.out.println("b의 값:" + b);
        System.out.println("b - a 는 " + (b - a) + "입니다");
    }
}
