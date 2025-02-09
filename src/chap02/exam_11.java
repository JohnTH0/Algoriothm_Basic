package chap02;


import java.util.Scanner;

public class exam_11 {
    // 속성 선언
    int year;
    int month;
    int day;

    // 달 별 일수
    static int[][] mdays = {
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }
    };

    // 윤년확인
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 생성자 선언
    public exam_11(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // 필요한 메서드
    public exam_11 before(int n){
        exam_11 temp = new exam_11(year, month, day);

        temp.day -= n;

        // 차감한 일이 해당월을 초과하는 경우
        while (temp.day < 1){
            // 1월인 경우
            if(--temp.month < 1){
                temp.year --;
                temp.month = 12;
            }
            temp.day += mdays[isLeap(year)][month - 1];
        }
        return temp;
    }

    public exam_11 after(int n){
        exam_11 temp = new exam_11(year, month, day);

        temp.day += n;

        // 더한 일수가 해당월을 초과하는 경우
        while (temp.day > mdays[isLeap(year)][month - 1]){
            temp.day -= mdays[isLeap(year)][month - 1];
            // 12월인 경우
            if(++temp.month > 12){
                temp.year ++;
                temp.month = 1;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 년월일 입력
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        int n;
        System.out.println("계산하고자 하는 일수");
        do {
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("0이상의 값을 입력해주세요");
            }
        } while (n <= 0);


        exam_11 date = new exam_11(year, month, day);

        exam_11 beforeDate = date.before(n);
        System.out.printf("%d일 전의 날짜: %d년 %d월 %d일 \n", n, beforeDate.year, beforeDate.month, beforeDate.day);


        exam_11 afterDate = date.after(n);
        System.out.printf("%d일 후의 날짜: %d년 %d월 %d일 \n", n, afterDate.year, afterDate.month, afterDate.day);
    }
}
