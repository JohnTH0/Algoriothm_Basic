package chap01;

import java.util.Scanner;

public class exam16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n <= 0);

        spira(n);
        System.out.println();
        spiraNum(n);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    static void spiraNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
