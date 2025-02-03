package chap02;

public class primeNumber2 {
    public static void main(String[] args) {
        int count = 0;
        int primeNumCount = 0;
        int[] primeArray = new int[1000];

        primeArray[primeNumCount++] = 2;

        for (int n = 3; n <= 1000; n+= 2) {
            int i;
            for (i = 1; i < primeNumCount; i ++){
                count++;
                if (n % primeArray[i] == 0) {
                    break;
                }
            }
            if (primeNumCount == i){
                primeArray[primeNumCount++] = n;
            }
        }

        System.out.println("count = " + count);
    }
}
