package Object;

public class CalculateDemo {

    public static void main(String[] args) {
        // c1 과 c2 는 각각 인스턴스.
        // class 는 설계도 / 인스턴스는 설계도대로 만든 구체적인 객체
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOperands(20, 40);
        c2.avg();

        // Calculator c3 = new Calculator(15, 30);
    }
}
