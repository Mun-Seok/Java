// 객체 배열 생성 후 객체에 값을 저장 후 출력하는 예제
public class InstanceEx4 {
    public static void main(String[] args) {
        TV[] tvArr = new TV[3];

        // TV 객체를 생성해서 TV 객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new TV();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10을 저장
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출. 채널이 1 증가
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
