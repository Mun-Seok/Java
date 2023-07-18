import java.util.*; // util directory 안에 있는 모든 클래스를 import
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의  객체 생성

        System.out.println("두자리 정수를 하나 입력해주세요."); // 두자리 정수를 입력해주세요.
        String input = scanner.nextLine(); // 문자열 input에 Scanner 클래스 사용해 입력 받음 / 입력한 숫자 77로 가정
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력 내용 : " + input); // 입력내용 : 77
        System.out.printf("num = %d %n", num); // num = 77
    }
}
