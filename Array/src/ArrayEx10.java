public class ArrayEx10 {
    public static void main(String[] args) {
        // 오름차 순으로 정렬하여 출력하는 예제
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10)); // numArr에 1부터 10까지 랜덤의 수를 저장하고 출력
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지를 체크

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꿈
                    int temp = numArr[j];
                    numArr[j] = numArr[i + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }

            if(!changed) break; // 자리바꿈이 없으면 반복문을 벗어남

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]); // 정렬된 결과를 출력
            }
            System.out.println();
        }
    }
}
