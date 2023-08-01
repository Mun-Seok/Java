import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        // 숫자를 입력받고 숫자의 각 자리의 합을 구하는 예제
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine(); // 입력받은 내용을 temp에 저장
        num = Integer.parseInt(temp);

        while (num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함     마지막 자리의 수를 빼면서 더함
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10; // num = num / 10; num을 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리의 수의 합 : " + sum);
    }
}
