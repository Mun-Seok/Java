// System.out의 출력 내용은 test.txt에 저장하고 System.err의 출력 내용만 화면에 표시하는 예제
import java.io.*;
public class StandardIOEx3 {
    public static void main(String args[]) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps); // System.out의 출력대상을 test.txt 파일로 변경
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
