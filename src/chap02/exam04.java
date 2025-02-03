package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        int[] a = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            a[i] = Integer.parseInt(sArr[i]);
        }
        int[] b = new int[a.length];
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        copy(a, b);
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));

        int[] c = new int[a.length];
        rcopy(a, c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
    }

    static void copy(int[] a, int[] b) {
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
        System.arraycopy(a, 0, b, 0, a.length);
    }

    static void rcopy(int[] a, int[] c) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[n - 1 - i];
        }
//        System.arraycopy(a, 0, b, 0, a.length);
    }
}
