import java.util.*;

public class FlowEx27 {
    public static void main(String[] args) {
        // 반복해서 숫자를 입력받다가 0을 입력하면 총 합을 출력하는 예제
        int num; // 입력받을 숫자
        int sum = 0; // 합계
        boolean flag = true; // 조건식에 사용될 변수
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

        while (flag) { // flag의 값이 true이므로 조건식은 참이 된다.
            System.out.print(">>");

            String temp = scanner.nextLine();
            num = Integer.parseInt(temp);

            if (num != 0) {
                sum += num; // num이 0이 아니면 sum에 더한다.
            } else {
                flag = false; // num이 0이면 flag의 값을 false로 변경
            }
        }
        System.out.println("합계 : " + sum);
    }
}