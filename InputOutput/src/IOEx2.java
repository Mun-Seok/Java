// int read(byte[], int off, int len)/void write(byte[] b, int off, int len)을 사용해 입출력하는 방법을 보여주는 예제
import java.io.*;
import java.util.Arrays;
public class IOEx2 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length); // 읽어 온 데이터를 배열 temp에 담는다.
        output.write(temp, 5, 5);   //  temp[5]부터 5개의 데이터를 write한다.

        outSrc = output.toByteArray();

        System.out.println("Input Source  : " + Arrays.toString(inSrc));
        System.out.println("temp          : " + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
