// 메서드에 예외를 발생시키고 전달하는 예제
public class ExceptionEx12 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}
