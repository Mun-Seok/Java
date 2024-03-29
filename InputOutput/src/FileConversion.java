// 파일의 공백을 모두 없애는 예제
import java.io.*;
public class FileConversion {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader(args[0]);
            FileWriter fw  = new FileWriter(args[1]);

            int data = 0;
            while ((data = fr.read()) != -1) {
                if ((data = fr.read()) != -1) {
                    if (data != '\t' && data != ' ' && data != '\r') {
                        fw.write(data);
                    }
                    fr.close();
                    fw.close();
                }
            }
        } catch (IOException e){
        e.printStackTrace();
        }
    }
}
