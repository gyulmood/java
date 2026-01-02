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

        // break 와 continue
        int a = 0;
        while (a < 10) {
            System.out.println("a = " + a);
            a ++;
        }

        int b = 0;
        while (b < 10) {
            if (b==5)
                break;
            System.out.println("b = " + b);
            b ++;
        }

        for (int c=0; c<10; c++) {
            if (c==5)
                continue;
            System.out.println("c = " + c);
        }

        // 중첩
        for (int n=0; n<10; n++) {
            for (int m=0; m<10; m++) {
                System.out.println("nm = " + n+m);
            }
        }

    }
}
