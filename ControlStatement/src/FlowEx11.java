import java.util.*;
public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장

        switch (gender) {
            case '1':
            case '3':
                switch(gender){
                    case '1':
                    System.out.println("");
                }
        }
    }
}
