package chap03;

import java.util.Scanner;

public class pratice01 {
    static int sequenceSearch(int[] numbers, int n, int target){
        int i = 0;

//        while(true){
//            if (i == n){
//                return -1;
//            }
//            if (numbers[i] == target){
//                return i;
//            }
//            i++;
//        }
        for(int j = 0; j < n; j++){
            if(numbers[i] == target){
                return i;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열길이: ");
        int num = sc.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("number[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("검색할 값: ");
        int target = sc.nextInt();

        int targetIdx = sequenceSearch(numbers, num, target);
        
        if (targetIdx == -1){
            System.out.println("target not found");
        }else{
            System.out.println("targetIdx = " + targetIdx);
        }

    }
}
