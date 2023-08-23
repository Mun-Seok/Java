// 호출한 메서드에서 예외처리를 해주는 예제
import java.io.*;
public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File file = createFile(args[0]);
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
        } catch (Exception exception) {
            System.out.println(exception.getMessage() + "다시 입력해주시기 바랍니다.");
        }
    }
    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File file = new File(fileName);
        // File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.
        file.createNewFile();
        return file;
    }
}
