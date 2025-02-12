package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRightStart {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[] intArr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for ( int j = n - 1; j > i; j--) {
                if (intArr[j - 1] > intArr[j]) {
                    swap(intArr, j - 1, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블정렬 1버전");
        System.out.print("배열길이: ");
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("intArr[" + i + "]: ");
            intArr[i] = sc.nextInt();
        }
        bubbleSort(intArr, n);
        System.out.println(Arrays.toString(intArr));
    }

}