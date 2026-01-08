package Scope;

public class Scope2 {
    static int i;

    static void a() {
        i = 0;
    }

    public static void main(String[] args) {
        // 무한루프
//        for (i = 0; i < 5; i++) {
//            a();
//            System.out.println(i);
//        }
    }
}
