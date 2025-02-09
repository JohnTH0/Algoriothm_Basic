package chap02;

public class primeNumber3 {
    public static void main(String[] args) {
        int count = 0;
        int primeNumCount = 0;
        int[] primeNumArray = new int[1000];

        primeNumArray[primeNumCount++] = 2;
        primeNumArray[primeNumCount++] = 3;

        for (int n = 5; n <= 1000; n += 2) {
            boolean isPrime = false;
            for (int i = 1; primeNumArray[i] * primeNumArray[i] <= n; i++) {
                count += 2;
                if ( n % primeNumArray[i] == 0 ) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                primeNumArray[primeNumCount++] = n;
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}