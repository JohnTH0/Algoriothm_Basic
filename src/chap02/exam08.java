package chap02;

import java.util.Scanner;

public class exam08 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int year, int month, int day){
        month -= 1;
        while(month --> 0){
            day += mdays[isLeap(year)][month];
        }
        return day;

//        int days = day;
//
//        for (int i = 1; i < month; i++){
//            days += mdays[isLeap(year)][i - 1];
//        }
//        return days;
    }

    static int leftDayOfYear(int year, int month, int day){
        int days = day;
        for(int i = 1; i < month ; i++){
            days += mdays[isLeap(year)][i - 1];
        }
        return 365 + isLeap(year) - days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        do {
            System.out.print("년: ");
            int year = sc.nextInt();
            System.out.print("월: ");
            int month = sc.nextInt();
            System.out.print("일: ");
            int day = sc.nextInt();

            System.out.printf("그 해 %d 일째입니다\n", dayOfYear(year, month, day));
            System.out.println("한번더?");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
