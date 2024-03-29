// 매개변수의 유효성 검사 코드를 추가한 재귀호출 예제
public class RecursiveCallEx2 {
    public static void main(String[] args) {
        int n =21;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0 < n <= 20) : %d%n", n);
                break;
            }

            System.out.printf("%2d != %20d%n", i, result);
        }
    }

    static long factorial(int n) {
        if (n <= 0 || n > 20) { // 매개변수의 유효성 검사
            return -1;
        }
        if(n<=1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
