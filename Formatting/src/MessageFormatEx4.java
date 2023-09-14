// 파일로부터 데이터를 라인별로 읽어서 처리하는 예제
import java.util.*;
import java.text.*;
import java.io.*;
//public class MessageFormatEx4 {
//    public static void main(String[] args) {
//        String tableName = "CUST_INFO";
//        String fileName = "data4.txt";
//        String msg = "INSERT INTO " + tableName + " VALUES ({0}, {1}, {2}, {3});";
//
//        Scanner s = new Scanner(new File(fileName));
//
//        String pattern = "{0}, {1}, {2}, {3}";
//        MessageFormat mf = new MessageFormat(pattern);
//
//        while (s.hasNextLine()) {
//            String Line = s.nextLine();
//            Object[] objs = mf.parse(line);
//            System.out.println(MessageFormat.format(msg, objs));
//        }
//        s.close(); // 작업이 끝났으니 Scanner에서 사용한 파일을 닫아 준다.
//    }
//}
