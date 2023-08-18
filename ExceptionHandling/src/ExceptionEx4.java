// try-catch문을 작성하고 예외를 발생시키지 않았을때 결과를 보는 예제
public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) { // 예외가 발생하지 않았기 때문에 실행되지 않는다.
            System.out.println(5);
        }
        System.out.println(6);
    }
}
