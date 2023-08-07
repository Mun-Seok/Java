// 참조형 매개변수를 사용해 값을 변경하고 출력하는 예제
//class Data{ int x; } // PrimitiveParamEx에서 작성함
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change2(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change2(Data d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
