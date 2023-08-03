public class ArrayEx7 {
    public static void main(String[] args) {
        // 숫자들의 순서를 섞어주는 예제이다.
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i; // 배열을 숫자 0~9로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
            // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
            int temp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }

}
