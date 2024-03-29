// FileInputStream을 사용해 파일의 내용을 출력하는 예제
import java.io.*;
public class FileViewer {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream(args[0]);
        int data = 0;

        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
