// 호출 스택의 변화를 보는 예제
public class CallStackEx1 {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
