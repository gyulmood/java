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
