// 기본형 매개변수를 사용한 메서드를 통해 값을 변경해보고 출력하는 예제
class Data { int x; }

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x=10;
        System.out.println("main() : x = " + d.x);

        change(d.x);

        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
