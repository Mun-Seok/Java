public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);

            for (int j = 0; j < 2_000_000_000; j++) {
                ; // 빈 문장 - 2,000,000,000번 반복하면서 시간을 보내기 위해 추가
            }
        }
        System.out.println("GAME_OVER");
    }
}
