package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortLeftStart {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void bubbleSort(int[] intArr, int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("패스 %d", i + 1);
            // 마지막 바로 이전 값까지 비교
            for (int j = 0; j < n - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    swap(intArr, j, j + 1);
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