// MessageFormat을 사용해 문자열을 정해진 양식에 넣어주는 예제
import java.text.*;
public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel : {1} \nAge : {2} \n Birthday : {3}";

        Object[] arguments = {
                "이자바", "02-123-1234", "27", "07-09"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
