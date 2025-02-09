package chap03;

import java.util.Arrays;
import java.util.Scanner;

// BinarySearchTester
public class exam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수");
        int num = sc.nextInt();
        int[] x = new int[num];;

        System.out.println("오름차순으로 입력");
        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값 ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x,key);

        if (idx < 0) {
            int insertPoint = -idx -1;
            System.out.println("target not found");
            System.out.printf("삽입 포인트는 %d입니다.\n", insertPoint);
            System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 배열의 정렬 상태가 유지됩니다.", insertPoint, key);
        } else{

            System.out.println(idx + " point : + x["+ idx +"]");
        }
    }
}
