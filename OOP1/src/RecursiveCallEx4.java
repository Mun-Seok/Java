// 재귀호출을 사용해 x^1부터 x^n까지의 합을 구하는 예제
public class RecursiveCallEx4 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }
}
