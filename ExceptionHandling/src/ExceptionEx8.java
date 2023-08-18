// 예외를 발생시키고 printStackTrace()와 getMessage()를 사용해 예외에 대한 정보를 확인하는 예제
public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
            System.out.println("예외 메시지 : " + arithmeticException);
        }
        System.out.println(6);
    }
}
