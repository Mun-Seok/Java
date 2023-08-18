// RuntimeException을 고의로 발생시키는 예제 (컴파일되지만 비정상적으로 종료)
public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.
    }
}
