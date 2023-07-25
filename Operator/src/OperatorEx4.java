public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // 부호 연산자 '+'를 사용하였지만 값은 그대로이다.
        System.out.println(i); // -10

        i = -10;
        i = -i; // 부호 연산자 '-'를 사용해 부호를 반대로 변경했다.
        System.out.println(i); // 10
    }
}
