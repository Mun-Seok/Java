// 하나의 쓰레드가 연속적으로 처리하는 시간을 측정하는 예제
public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.print("소요시간 1 : " + (System.currentTimeMillis() - startTime));
        for(int i=0;i<300; i++){
            System.out.printf("%s", new String("|"));
        }
        System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }
}
