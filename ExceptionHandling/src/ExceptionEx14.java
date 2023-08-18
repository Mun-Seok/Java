// 예외를 발생시킨 메서드를 main 메서드에서 처리해주는 예외
public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception {
        throw new Exception();
    }
}
