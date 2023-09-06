// StringTokenizer의 생성자를 사용해 구분자도 토큰으로 간주해 나누어 출력하는 예제
import java.util.*;
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
