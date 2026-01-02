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
    }
}
