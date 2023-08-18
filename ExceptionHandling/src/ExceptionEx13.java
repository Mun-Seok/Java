// 메서드에 예외를 발생시키고 처리한 뒤 printStackTrace() 메서드를 사용해 출력해보는 예제
public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
