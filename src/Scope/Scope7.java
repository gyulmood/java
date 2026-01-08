package Scope;

public class Scope7 {
    static void a() {
        int i = 2; // 지역변수
        b();
    }

    static void b() {
        // 변수 i 를 찾지 못하여 에러발생
        // System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 5; // 지역변수
        a();
    }
}
