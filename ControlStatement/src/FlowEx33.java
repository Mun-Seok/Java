public class FlowEx33 {
    public static void main(String[] args) {
        // 구구단을 출력하는 예제
        Loop1 : for(int i = 2; i <= 9;i++){
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
//                    break Loop1;
                    break;
//                    continue Loop1;
//                    continue;
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
