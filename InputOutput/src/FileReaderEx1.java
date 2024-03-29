// FileInputStream과 FileReader의 차이점을 보여주는 예제 (FileInputStream을 사용했을 떼 한글이 깨져서 출력)
import java.io.*;
public class FileReaderEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            // FileInputStream을 이용해서 파일내용을 읽어 화면에 출력한다.
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            // FileReader를 이용해서 파일내용을 읽어 화면에 출력한다.
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
