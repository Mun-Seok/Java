// 예외가 발생한 메서드에서 직접 예외를 처리하는 예제
import java.io.*;
public class ExceptionEx15 {
    public static void main(String[] args) {
        // command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
        File file = createFile(args[0]);
        System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try{
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        }catch(Exception exception){
            // fileName이 부적절한 경우, 파일이름을 '제목없음.txt'라 한다.
            fileName = "제목없음.txt";
        }finally {
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception exception) {

        }
    }
}
