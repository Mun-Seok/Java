public class FlowEx30 {
    public static void main(String[] args) {
        // 숫자를 1부터 계속 더하면 합이 100을 넘는 수를 구하는 예제
        int sum = 0;
        int i = 0;
        while (true) {
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
