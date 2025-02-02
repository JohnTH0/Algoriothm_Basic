package chap02;
import java.util.Random;
import java.util.Scanner;

class exam01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]：" + height[i]);
        }
    }
}