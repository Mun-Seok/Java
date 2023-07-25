public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5;
        i++; // i + 1과 같은 의미이다. 후위형
        System.out.println(i); // 6

        i=5; // 결과를 보기위해 i 값을 다시 5로 변경
        ++i; // 전위형
        System.out.println(i); // 6
    }
}
