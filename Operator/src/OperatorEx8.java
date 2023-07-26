public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000; //1,000,000 1백만
        int b = 2_000_000; //2,000,000 2백만

        long c = a * b; // a * b = 2,000,000,000,000이지만 int 타입과 int 타입으로 연산을 해 int 타입이 결과로 -1454759936이 저장

        System.out.println(c); // - 1454759936
    }
}
