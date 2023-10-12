// 출력작업이 수행되었을 때 파일 포인터의 위치가 달라지는 것을 보여주는 예제
import java.io.*;
public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
