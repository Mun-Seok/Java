import java.util.*; // Scanner 클래스 추가 위해 util의 하위 클래스 import

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요. → ");

        String input = scanner.nextLine(); // 문자열 input에 입력한 문자 저장 / 7과 a를 입력한다고 가정
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') { // 7일때 출력
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) { // a일때 출력
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }

    }
}
