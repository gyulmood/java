package Scope;

public class Scope4 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 변수 i 는 반복문 안에서만 유효
            System.out.println(i);
        }
        // 유효한 변수가 아님
        //System.out.println(i);
    }
}
