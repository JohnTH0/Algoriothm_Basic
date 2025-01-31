package chap01;

import java.util.Scanner;

public class exam04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int medValue = med3(a, b, c);
        System.out.println("medValue = " + medValue);
    }
    public static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }
}

//  if || 의 경우 조건을 양쪽 다 확인해야하므로 비효율적