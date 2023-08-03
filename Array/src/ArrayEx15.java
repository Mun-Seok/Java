public class ArrayEx15 {
    public static void main(String[] args) {
        // 문자열을 모르스 부호로 변환하는 예제
        String source = "SOSHELP";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."
        };

        String result = "";
        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source : " + source);
        System.out.println("morse : " + result);
    }
}
