// int형 배열 score의 값들을 DataOutputStream을 이용해 score.dat 파일에 출력하는 예제
import java.io.*;
public class DataOutputStreamEx3 {
    public static void main(String[] args) {
        int[] score = {100, 90, 95, 85, 80};

        try {
            FileOutputStream fos = new FileOutputStream("simple.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            for (int i = 0; i < score.length; i++) {
                dos.writeInt(score[i]);
            }

            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
