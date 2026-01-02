public class Iteration {

    public static void main(String[] args) {

        // while 문
        // 소괄호 안의 조건이 true 인 동안 중괄호 안의 작업을 반복 수행
        int i = 0;
        while(i < 7) {
            System.out.println("- gyul Coding everyday : day " + (i+1));
            i ++;
        }

        // for 문
        // for (초기화;종료조건;반복실행;) {}
        for (int j=0;j<7;j++) {
            System.out.println("-- gyul Coding everyday : day " + (j+1));
        }

        for (int r=1;r<=7;r++) {
            System.out.println("--- gyul Coding everyday : day " + r);
        }

    }
}
