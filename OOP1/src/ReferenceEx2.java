// 배열을 사용해 값을 변경해보고 출력하는 예제
public class ReferenceEx2 {
    public static void main(String[] args) {
        int[] x = {10}; // 크기가 1인 배열
        System.out.println("main() : x = " + x[0]);

        change3(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change3(int[] x) { // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change3() : x = " + x[0]);
    }
}
