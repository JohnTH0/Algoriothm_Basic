package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class exam03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("배열 입력 ex) 1 2 3 4 5");
        String s = br.readLine();

        // 입력받은 값을 공백 기준으로 분리한 후, Stream을 사용해 int[]로 변환
        int[] numbers = Arrays.stream(s.split(" "))  // 공백을 기준으로 분리
                .mapToInt(Integer::parseInt)  // 각 요소를 int로 변환
                .toArray();  // int[]로 변환

        System.out.println("타겟 값 입력");
        int target = Integer.parseInt(br.readLine());

        int count = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target){
                count++;
                arr.add(i);
            }
        }

        if (arr.isEmpty()){
            System.out.println("target not found");
        } else{
            int[] idx = arr.stream()
                    .mapToInt(Integer::intValue)  // Integer를 int로 변환
                    .toArray();  // int[]로 변환

            System.out.println("개수 : " + count);
            System.out.println("위치 : " + Arrays.toString(idx));
        }
    }
}
