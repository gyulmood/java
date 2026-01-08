package Scope;

public class C {
    int i =5;

    void m() {
        int i = 7;
        System.out.println(i);
        System.out.println(this.i);
    }
}
