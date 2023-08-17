// 직접적인 관계에 있는 두 클래스를 보여주는 예제
class A {
    public void methodA(B b){
        b.methodB();
    }
}
class B {
    public void methodB(){
        System.out.println("methodB()");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
