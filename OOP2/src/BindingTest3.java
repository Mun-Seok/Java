// 참조변수의 타입에 따른 멤버변수의 차이를 this와 super를 통해 보는 예제
public class BindingTest3 {
    public static void main(String[] args) {
        Parent2 p = new Child5();
        Child5 c = new Child5();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Child5 extends Parent2 {
    int x = 200;

    void method() {
        System.out.println("x = " + x); // this.x와 같다
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}