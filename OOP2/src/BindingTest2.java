// 참조변수의 타입에 따라 달라지는 멤버변수를 확인하는 예제
public class BindingTest2 {
    public static void main(String[] args) {
        Parent2 p = new Child4();
        Child4 c = new Child4();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
class Child4 extends Parent2 { }
