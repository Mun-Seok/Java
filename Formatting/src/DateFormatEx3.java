// parse(String source)를 사용하여 날짜 데이터의 출력형식을 변환하는 방법을 보여주는 예제
import java.util.*;
import java.text.*;
public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date d = df.parse("2023년 9월 17일"); // 문자열을 Date 인스턴스로 변환
            System.out.println(df2.format(d));
        } catch (Exception e) { }
    }
}
