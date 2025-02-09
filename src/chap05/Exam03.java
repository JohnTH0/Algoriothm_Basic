package chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }else{
            return gcd(y, x%y);
        }
    }

    static int gcdArray(int[] arr) {
        int gcdNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcdNum = gcd(arr[i], gcdNum);
        }
        return gcdNum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] intArr = new int[s.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(s[i]);
        }

        int gcd = gcdArray(intArr);
        System.out.println(gcd);

    }
}
