public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; // round 메서드를 사용해서 반올림 해준다.

        System.out.println(shortPi); // 3.142
    }
}
