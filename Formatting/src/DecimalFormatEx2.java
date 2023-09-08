// 패턴을 이용해서 숫자를 다르게 변환하는 예제
import java.text.*;
public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.printf("1,234,567.89");

            double d = num.doubleValue();
            System.out.print(d + " → ");

            System.out.println(df2.format(num));
        } catch (Exception e) {}
    }
}
