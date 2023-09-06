// 구분자를 ','로 하는 문자열 데이터를 String 클래스의 split()과 StringTokenizer로 잘라낸 결과를 비교하는 예제
import java.util.*;
public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "|");
        }
        System.out.println("개수 : " + result.length);

        int i = 0;
        for (; st.hasMoreTokens(); i++) {
            System.out.println(st.nextToken() + "|");
        }
        System.out.println("개수 : " + i);
    }
}
