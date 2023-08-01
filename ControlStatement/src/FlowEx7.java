import java.util.*;
public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt(); // 입력받은 숫자를 user에 저장
        int com = (int) (Math.random() * 3 + 1); // 1,2,3 중 하나가 com에 저장됨

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");

        switch (user - com) {
            case 2: // 보,가위
            case -1: // 바위, 보   가위,바위
                System.out.println("당신이 졌습니다.");
                break;
            case 1: // 바위,가위    보,바위
            case -2: // 가위,보
                System.out.println("당신이 이겼습니다.");
                break;
            case 0: // 가위,가위    바위,바위   보,보
                System.out.println("비겼습니다.");
                break;
        }
     }
}
