package Object;

public class Calculator {
    int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

//    public void setOperands(int left, int right) {
//        this.a = left;
//        this.b = right;
//    }

    public void sum() {
        System.out.println(this.a + this.b);
    }

    public void avg() {
        System.out.println((this.a + this.b) / 2);
    }
}
