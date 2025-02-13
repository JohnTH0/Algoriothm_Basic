package chap06;

import java.util.Arrays;
import java.util.Scanner;

/*
    # 버블정렬
    - 가장 (앞)끝 에있는 값 두개를 비교하는 걸 반복해서 값을 하나씩 정리해나가는 방식
 */
public class BubbleSort_1 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[] intArr, int n) {
        int tradeCount = 0;
        int compCount = 0;

        // 끝에 두 값을 비교 하므로 최대길이는 n - 1
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("패스%d：\n", i + 1);
            // j = 가장 마지막에있는 값
            for (int j = n - 1; j > i; j--) {
                // 여기서 출력 필요 => 처음부터 바로 비교 결과를 출력
                for (int k = 0; k < n - 1; k++) {
                    System.out.printf("%3d %c", intArr[k], (k != j - 1) ? ' ' : (intArr[j - 1] > intArr[j]) ? '+' : '-');

                }
                System.out.printf("%3d\n", intArr[n - 1]);

                // 해당 값과 그 앞의 값을 비교
                // 현재 위치 값이 그 앞에 있는 값보다 크다면 자리 변경
                if (intArr[j - 1] > intArr[j]) {
                    swap(intArr, j - 1, j);
                    tradeCount++;
                }
                compCount++;
            }
        }
        System.out.println(tradeCount);
        System.out.println(compCount);
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