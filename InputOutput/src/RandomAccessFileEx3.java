// score2.dat 파일에서 국어과목의 점수 합계를 출력하는 예제
import java.io.*;
public class RandomAccessFileEx3 {
    public static void main(String[] args) {
        int sum = 0;


        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
            int i = 4;

            while (true) {
                raf.seek(i);
                sum += raf.readInt();
                i += 16;
            }
        } catch (EOFException e) {
            System.out.println("sum : " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
