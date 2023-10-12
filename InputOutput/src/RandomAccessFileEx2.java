// 배열에 저장된 데이터를 score2.dat에 저장한 다음 저장된 내용을 readInt()로 출력하는 예제
// (writeInt() 수행하면서 포인터 위치가 마지막으로 이동해 화면에 출력되지 않음)
import java.io.*;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        //             번호, 국어, 영어, 수학
        int[] score = { 1, 100,  90,  90,
                        2,  70,  90, 100,
                        3, 100, 100, 100,
                        4,  70,  60,  80,
                        5,  70,  90, 100
        };

        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
            for (int i = 0; i < score.length; i++) {
                raf.writeInt(score[i]);
            }
            while (true) {
                System.out.println(raf.readInt());
            }
        } catch (EOFException eof) {
            // readInt()를 호출했을 때 더 이상 읽을 내용이 없으면 EOFException이 발생한다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
