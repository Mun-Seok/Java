// try-catch문을 사용하고 예외를 발생시켰을 때 어떤 catch문이 실행되는지 보는 예제
public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException arithmeticException){
            if(arithmeticException instanceof ArithmeticException){
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
