import java.util.*;

public class MultiArrEx2 {
    public static void main(String[] args) {
        // 빙고 게임
        final int SIZE = 5; // 빙고판 사이즈
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE]; // 5×5 크기의 빙고판 생성
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소를 1부터 SIZE * SIZE까지의 숫자로 초기화
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1; // 1~25 (0 * 5 + 0 + 1 = 1 ~ 4 * 5 + 4 + 1 = 25)
            }
        }

        // 배열에 저장된 값을 뒤섞는다. (shuffle)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int temp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = temp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d의 숫자를 입력하세요. (종료 : 0)>", SIZE * SIZE);
            String temp = scanner.nextLine(); // 입력받은 내용을 temp에 저장
            num = Integer.parseInt(temp); //  입력받은 문자열(temp)를 숫자로 변환

            // 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer; // 2중 반복문을 벗어난다.
                    }
                }
            }
        } while (num != 0);
    }
}
