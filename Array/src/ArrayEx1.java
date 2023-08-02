public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열 score에 점수를 저장하고 출력하는 예제
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; // score[2] = 70과 같다.
        score[3] = 80;
        score[4] = 90;

        int temp = score[k + 2] + score[4];

        // for문으로 배열의 모든 요소를 출력한다.
        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d] : %d%n", i, score[i]);
        }

        System.out.printf("temp : %d%n", temp);
        System.out.printf("score[%d] : %d%n", 7, score[7]); // index의 범위를 벗어난 값
    }
}
