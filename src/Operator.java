public class Operator {

    public static void main(String[] args) {

        // 산술 연산자
        int result = 1+2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 5;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        int a = 10;
        int b = 3;

        float c = 10;
        float d = 3;

        System.out.println("a/b = " + a/b);
        System.out.println("c/d = " + c/d);

        // 비교 연산자 && boolean
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println(1!=1);

        String s = "gyul";
        String s1 = new String("gyul");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }
}
