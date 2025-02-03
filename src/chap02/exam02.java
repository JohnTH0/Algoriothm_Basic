package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        int[] intArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            intArr[i] = Integer.parseInt(sArr[i]);
        }

        System.out.println("first intArr = " + Arrays.toString(intArr));

        System.out.println("역순 정렬을 마쳤습니다 " + Arrays.toString(reverseArray(intArr)));

        System.out.println("배열의 모든 합 : " + sumArray(intArr));
    }

    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("arr = " + Arrays.toString(arr));
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            System.out.println("arr[" + i + "] 와 arr[" + (arr.length - i) + "] 를 교환합니다" + Arrays.toString(arr));
        }

        return arr;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
