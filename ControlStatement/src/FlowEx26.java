public class FlowEx26 {
    public static void main(String[] args) {
        // 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 되는지 알아내는 예제
        int sum = 0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
