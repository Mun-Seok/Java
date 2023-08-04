import java.util.*;

public class MultiArrEx4 {
    public static void main(String[] args) {
        // 영단어를 보여주고 단어의 뜻을 맞추는 예제
        String[][] words = {
                {"chair", "의자"},        // words[0][0], words[0][1]
                {"computer", "컴퓨터"},    // words[1][0], words[1][1]
                {"integer","정수"}        // words[2][0], words[2][1]
        };
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

            String temp = scanner.nextLine();

            if (temp.equals(words[i][1])) {
                System.out.printf("정답입니다. %n%n");
            } else{
                System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
            }
        }
    }
}
