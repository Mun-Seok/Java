// super와 this 사용해서 변수 출력하는 예제
public class SuperTest2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}
/*// 앞에서 Parent 클래스 정의함
class Parent {
    int x = 10;
}*/

class Child2 extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}