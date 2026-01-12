package Object;

public class SubtractionableCalculator extends Calculator {

    public SubtractionableCalculator(int a, int b){
        super(a, b); // 부모 클래스의 생성자를 먼저 호출해준다.
    }

    public void subtract() {
        System.out.println(this.a - this.b);
    }
}
