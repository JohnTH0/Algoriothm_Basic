package chap05;

import java.util.Scanner;

class EuclidGCD {
    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }else{
            return gcd(y, x%y);
        }
    }

    static int gcdNonRecursive(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("최대공약수(greatest common divisor)는 " + gcd(x, y) + "입니다.");
        System.out.println("최대공약수(greatest common divisor)는 " + gcdNonRecursive(x, y) + "입니다.");
    }
}
