// ','를 구분자로 하는 StringTokenizer를 생성해서 문자열을 나누어 출력하는 예제
import java.util.*;
public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
