// 고의로 예외를 발생시키보는 예제
public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e; // 예외를 발생시켰다.
//            throw new Exception("고의를 발생시켰음"); // 위의 줄과 같은 내용
        } catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
