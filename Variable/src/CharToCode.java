public class CharToCode {
    public static void main(String[] args) {

        char ch = 'A'; // char ch = 65와 같다
        int code = (int) ch; // char에 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c = %d (%#X) %n", ch, code, code); // A = 65 (0X41)

        char hch = '가'; // char hch = 0xAC00이랑 같다
        System.out.printf("%c = %d (%#X) %n", hch, (int) hch, (int) hch); // 가 = 44032 (0XAC00)

    }
}
