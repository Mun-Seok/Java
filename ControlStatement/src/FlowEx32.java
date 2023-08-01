import java.util.*;

public class FlowEx32 {
    public static void main(String[] args) {
        // 메뉴를 보여주고 선택하게 하는 예제
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료는 0)");

            String temp = scanner.nextLine(); // 입력받은 내용을 temp에 저장
            menu = Integer.parseInt(temp);  // 문자열을 숫자로 변환

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
        }
    }
}
