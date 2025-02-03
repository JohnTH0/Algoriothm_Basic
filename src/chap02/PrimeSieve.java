package chap02;

public class PrimeSieve {
    public static void main(String[] args) {
        int limit = 1000;
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // 소수 출력
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.println(i);

            }
        }
    }
}
