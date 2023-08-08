// static import문을 활용해 클래스 이름을 생략하는 예제
import static java.lang.System.out;
import static java.lang.Math.*;
public class StaticImportEx1 {
    public static void main(String[] args) {
        out.println(random());
        out.println("Math.PI : " + PI);
    }
}
