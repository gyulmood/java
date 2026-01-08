package Scope;

public class Scope3 {
    static void a() {
        String a = "hi gyul"; // 지역 변수
    }

    public static void main(String[] args) {
        a();
        // 지역 변수라 접근 불가
        // System.out.println(a);
    }
}
