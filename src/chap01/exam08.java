package chap01;

import java.util.Scanner;

public class exam08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n == 1){
            sum = n;
            System.out.println("sumResult = " + sum);
        } else{
            sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        }
        System.out.println("sum = " + sum);
    }
}
