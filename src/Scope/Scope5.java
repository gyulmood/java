package Scope;

public class Scope5 {
    static int i = 7;

    static void a() {
        int i = 4; // 지역변수
        b();
    }

    static void b() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 1; // 지역변수
        a(); // 7
    }
}
