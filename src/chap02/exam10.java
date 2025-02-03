package chap02;

import java.util.Scanner;

public class exam10 {
    static final int VMAX = 13;     //시력 분포값

    static class PhyscData{
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum / dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;

        dist[i] = 0;

        for (int j = 0; j < dat.length; j++) {
            if (dat[j].vision >= 0.0 && dat[j].vision <= VMAX / 10.0){
                dist[(int)(dat[j].vision * 10)]++;  // 각 사람의 시력 값에 맞는 인덱스에 카운트
            }
        }
    }

    static String covertPeopleToStar(int people){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < people; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("Alpha", 163, 0.3),
                new PhyscData("Beta", 184, 0.7),
                new PhyscData("Gamma", 192, 1.2),
                new PhyscData("Delta", 179, 0.8),
                new PhyscData("Epsilon", 153, 0.5),
                new PhyscData("Zeta", 169, 0.8),
                new PhyscData("Skew", 172, 0.2),
                new PhyscData("Tau", 170, 1.0),
        };
        int[] vdist = new int[VMAX];

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            String convertStar = covertPeopleToStar(vdist[i]);
//            System.out.printf("%3.1f~: %2d명\n", i / 10.0, vdist[i]);
            System.out.printf("%3.1f~：", i / 10.0);
            System.out.print(convertStar + "\n");
        }

    }
}
