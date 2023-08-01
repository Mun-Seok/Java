import java.util.*;
public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다. %n", score);

        if (score >= 90) { // score가 90점보다 크거나 같으면 A학점
            grade = 'A';
            if (score >= 98) { // score가 98점보다 크거나 같으면 A+
                opt = '+';
            } else if (score < 94) { // score가 90점 이상 94점 미만이면 A-
                opt = '-';
            }
        } else if (score >= 80) { // score가 80점보다 크거나 같으면 B학점
            grade = 'B';
            if (score >= 88) { // score가 90점보다 작고 88점 이상이면 B+
                opt = '+';
            } else if (score < 84) { // score가 80점이상 84점 미만이면 B-
                opt = '-';
            }
        } else { // 나머지는 C학점
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
    }
}
