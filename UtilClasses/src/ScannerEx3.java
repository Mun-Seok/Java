// data3.txt의 데이터를 읽어서 계산하는 예제 (구분자로 라인별로 읽은 다음 다시 ','를 구분자로 데이터를 읽음)
import java.util.Scanner;
import java.io.File;
public class ScannerEx3 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(new File("data3.txt"));
        int cnt = 0;
        int totalSum = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line : " + cnt + ", Total : " + totalSum);*/
    }
}
