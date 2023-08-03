public class ArrayEx3 {
    public static void main(String[] args) {
        // 배열을 for문으로 복사하는 예제
        int[] arr = new int[5];

        // 배열 arr에 1~5를 저장한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("[변경전]");
        System.out.println("arr.lenth : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        int[] temp = new int[arr.length * 2];

        // 배열 arr에 저장된 값을 배열 temp에 복사한다.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;

        System.out.println("[변경후]");
        System.out.println("arr.length : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
