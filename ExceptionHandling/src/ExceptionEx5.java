// try-catch문을 작성한 뒤 예외를 발생시킨 결과를 보는 예제
public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
