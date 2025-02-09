package chap05;

import java.util.Scanner;

/*
    1. main에서 factorial(3)을 호출
    2. factorial(3)에서 return 값을 구하기 위해 factorial(2)를 호출 // factorial(3 - 1)
    3. factorial(2)에서 return 값을 구하기 위해 factorial(1)를 호출 // factorial(2 - 1)
    4. factorial(1)에서 1을 반환 => else 조건
    5. factorial(2)에서 2 * 1을 반환 => 2 * factorial(1)에서 return 받은 값 1
    6. factorial(3)에서 3 * 2을 반환 => 3 * factorial(2)에서 return 받은 값 2
    7. 결과 6을 출력
 */

public class Factorial {
    static int factorial(int n) {
        /*
            재귀로 한번 호출할 때마다 n - 1
         */
        if(n > 0){
            return n * factorial(n-1);
        }else{
            return 1;
        }
    }

    static int factorialNonRecursive(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
        System.out.println("The factorial of " + n + " is " + factorialNonRecursive(n));
    }
}
