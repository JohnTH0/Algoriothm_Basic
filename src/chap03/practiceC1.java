package chap03;

// 클래스 메서드, 인스턴스 메서드
class Id {

    // 클래스
    private static int counter = 0;

    // 인스턴스
    private int id;

    // 생성자
    public Id() {
        id = ++counter;
    }

    // 인스턴스 메서드
    public int getId() {
        return id;
    }

    // 클래스 메서드
    public static int getCounter() {
        return counter;
    }
}

public class practiceC1{
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());

    }
}
