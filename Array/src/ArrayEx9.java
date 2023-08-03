import java.util.*; // Arrays.toString() 메서드 사용하기 위해 추가

public class ArrayEx9 {
    public static void main(String[] args) {
        // 임의의 값으로 배열을 채우는 예제
        int[] code = {-4, -1, 3, 6, 11}; // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int temp = (int) (Math.random() * code.length);
            arr[i] = code[temp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
