// interface에서 default 메서드를 사용해보는 예제
public class DefaultMethodTest {
    public static void main(String[] args) {
        Child6 c = new Child6();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child6 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method2() in Child"); // 오버라이딩
    }
}
class Parent3 {
    public void method2() {
        System.out.println("method2() in Parent2");
    }
}

interface MyInterface{
    default void method(){
        System.out.println("method1() in Myinterface");
    }
    default void method2(){
        System.out.println("method2() int Myinterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2{
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() int MyInterface2");
    }
}