// 이름이 같은 멤버변수를 중복으로 정의한 예제
public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent2 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
