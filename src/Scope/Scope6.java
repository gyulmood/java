package Scope;

public class Scope6 {
    static int i = 7; // 클래스변수(static field)

    static void a() {
        int i = 4; // 지역변수 (local variable)
        b();
    }

    static void b() {
        int i = 2; // 지역변수
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 1; // 지역변수
        a(); // 2
    }
}
