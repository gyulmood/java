package Member;

public class C1 {

    // static_variable 과 instance_variable 은 모두 전역변수(global variable)
    // static_variable 은 클래스변수(static field) / instance_variable 은 인스턴스 변수(non-static field)
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instance() {
        // static method 에서는 non-static field 에 접근 불가능
        // System.out.println(instance_variable);
    }

    void instance_static() {
        System.out.println(static_variable);
    }

    void instance_instance() {
        System.out.println(instance_variable);
    }
}
