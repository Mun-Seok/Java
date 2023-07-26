public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b); // 명시적 형변환
        System.out.println(c); // 10 * 30 = 300이지만 데이터의 손실이 발생해 44가 저장되었다.  44
    }
}
