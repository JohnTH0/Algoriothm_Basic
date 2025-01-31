package chap01;

import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minValue = 0;
        int a = 0, b = 0, c = 0, d = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        minValue = min4(a,b,c,d);

        System.out.println("minValue = " + minValue);

    }
    public static int min4(int a, int b, int c, int d) {
        int min = a;
        min = Math.min(a,b);
        min = Math.min(min,c);
        min = Math.min(min,d);
        return min;
    }
}
