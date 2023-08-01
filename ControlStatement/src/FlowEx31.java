public class FlowEx31 {
    public static void main(String[] args) {
        // 1~10사이의 숫자 출력하는데 3의 배수는 제외하는 예제
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
