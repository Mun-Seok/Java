// 클래스 초기화 블럭을 사용해 배열의 각 요소들을 임의의 값으로 저장하고 출력하는 예제
public class InitializationBlockEx2 {
    static int[] arr = new int[10];

    static{
        for (int i = 0; i < arr.length; i++) {
            // 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
