public class Condition {

    public static void main(String[] args) {

        // if 문
        int a = 1;
        if (a == 1) {
            System.out.println("one");
        } else if (a == 2) {
            System.out.println("two");
        } else {
            System.out.println("three");
        }

        /**
         * 81 <= .. <= 100 사이에 속하는 점수를 뽑아내어
         * 바깥 if 문은 90점과 80점을 기준으로,
         * 중첩 if 문은 95점과 85점을 기준으로 A+, A, B+, B, C 출력
         */
        int score = (int) (Math.random() * 20) + 81;
        if (score >= 90) {
            if (score >= 95) {
                System.out.println("score = " + score + "(A+)");
            } else {
                System.out.println("score = " + score + "(A)");
            }
        } else if (score >= 80) {
            if (score >= 85) {
                System.out.println("score = " + score + "(B+)");
            } else {
                System.out.println("score = " + score + "(B)");
            }
        } else {
            System.out.println("score = " + score + "(C)");
        }

        // switch 문
        switch (a) {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            default:
                System.out.println("three");
                break;
        }

        // 논리연산자와의 결합
        String id = "gyul";
        String password = "password1234";

        if (id.equals("gyul") && password.equals("password1234")) {
            System.out.println("success!");
        } else {
            System.out.println("fail!");
        }

        if (id.equals("gyul") || password.equals("password0000")) {
            System.out.println("success@");
        } else {
            System.out.println("fail@");
        }

        if (!id.equals("gyul") || !password.equals("password1234")) {
            System.out.println("fail~");
        } else {
            System.out.println("success~");
        }
    }
}
