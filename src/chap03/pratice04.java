package chap03;

import java.util.Arrays;
import java.util.Scanner;


/* 이진 탐색법 */
public class pratice04 {
    static int binSearch(int[] a, int n, int target){
        int start = 0;
        int end = n - 1;

        do {
            int center = (start + end) / 2;
            if(a[center] == target){
                return center;
            }else if (a[center] < target){
                start = center + 1;
            }else{
                end = center - 1;
            }
        }while(start <= end);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이");
        int num = sc.nextInt();
        int[] number = new int[num];

        System.out.print("첫번째값 잆력:");
        int first = sc.nextInt();
        number[0] = first;

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("number[" + i + "] = ");
                number[i] = sc.nextInt();
            } while (number[i] < number[i - 1]);
        }
        System.out.println("Arrays.toString(number = " + Arrays.toString(number));
        
        System.out.println("목표값: ");
        int target = sc.nextInt();

        int targetIdx = binSearch(number, num, target);
        if(targetIdx == -1){
            System.out.println("target not found");
        }else{
            System.out.println("targetIdx = " + targetIdx);
        }

    }
}
