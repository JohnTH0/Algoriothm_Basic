package chap01;

import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minValue = 0;
        int a = 0, b = 0, c = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        minValue = min3(a, b, c);
        System.out.println("minValue = " + minValue);
    }
    static int min3(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);

        return min;
    }
}
