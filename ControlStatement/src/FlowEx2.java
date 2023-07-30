import java.util.*; // Scanner 클래스 사용하기 위해 추가

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.println("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine(); // 입력받은 값을 temp에 저장
        input = Integer.parseInt(temp); // temp에 저장된 문자열을 숫자로 변환

        if (input == 0) { // input이 0일때 실행
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if (input != 0) { // input이 0이 아닐때 실행
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d 입니다.",input);
        }
    }
}
