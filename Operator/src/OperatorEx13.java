public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
//        char c2 = c1 + 1; // 에러 발생
        char c2 = 'a' + 1; // 에러 발생하지 않음

        System.out.println(c2); // b
    }
}
