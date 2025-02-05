package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class exam07 {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                    (d1.height < d2.height) ? -1 : 0;
            }
        }

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return Double.compare(d1.vision, d2.vision);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {					// 키의 오름차순으로 정렬되어 있습니다.
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 169, 0.8),
                new PhyscData("홍준기", 171, 1.5),
                new PhyscData("전서현", 173, 0.7),
                new PhyscData("이호연", 174, 1.2),
                new PhyscData("이수민", 175, 2.0),
        };
        Arrays.sort(x, PhyscData.VISION_ORDER);
        System.out.println(Arrays.toString(x));

        /*
        System.out.print("찾고자 하는 키 : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("", height,0.0),
                PhyscData.HEIGHT_ORDER
        );
        */
        System.out.println("찾고자 하는 시력 : ");
        double vision = sc.nextDouble();
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("", 0,vision),
                PhyscData.VISION_ORDER);

        if (idx < 0){
            System.out.println("target not found");
        }else{
            System.out.println("x[" + idx + "] = " + x[idx].toString());
        }
    }
}
