package chap01;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = 0, b = 0, c = 0, d = 0;

        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            break;
        }

        int max = max4(a, b, c, d);
        System.out.println("maxValue = " + max);
    }
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        if (d > max){
            max = d;
        }
        return max;
    }
}
