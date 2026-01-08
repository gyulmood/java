package Member;

public class ClassMember {

    public static void main(String[] args) {

        C1 c = new C1();

        // 인스턴스 -> 클래스 메소드 접근 O
        // 정적 메소드 -> 클래스 변수 접근 O
        c.static_static();

        // 인스턴스 -> 클래스 메소드 접근 O
        // 정적 메소드 -> 인스턴스 변수 접근 X
        c.static_instance();

        // 인스턴스 -> 인스턴스 메소드 접근 O
        // 인스턴스 메소드 -> 클래스 변수 접근 O
        c.instance_static();

        // 인스턴스 -> 인스턴스 메소드 접근 O
        // 인스턴스 메소드 -> 인스턴스 변수 접근 O
        c.instance_instance();

        // 클래스 -> 클래스 메소드 접근 O
        // 클래스 메소드 -> 클래스 변수 접근 O
        C1.static_static();

        // 클래스 -> 클래스 메소드 접근 O
        // 클래스 메소드 -> 인스턴스 변수 접근 X
        C1.static_instance();

        // 클래스 -> 인스턴스 메소드 접근 X
        // C1.instance_static();

        // 클래스 -> 인스턴스 메소드 접근 X
        // C1.instance_instance();
    }
}
