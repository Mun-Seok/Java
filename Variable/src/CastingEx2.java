public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i; // int 타입에서 byte 타입으로 형변환
        System.out.printf("[int → byte] i = %d → b = %d%n", i, b); // [int → byte] i = 10 → b = 10

        i = 300;
        b = (byte) i; // int 타입에서 byte 타입으로 형변환
        System.out.printf("[int → byte] i = %d → b = %d%n", i, b); // [int → byte] i = 300 → b = 44

        b = 10;
        i = (int) b; // byte 타입에서 int 타입으로 형변환
        System.out.printf("[byte → int] b = %d → i = %d%n", b, i); // [byte → int] b = 10 → i = 10

        b = -2;
        i = (int) b; // byte 타입에서 int 타입으로 형변환
        System.out.printf("[byte → int] b = %d → i = %d%n", b, i); // [byte → int] b = -2 → i = -2

        System.out.println("i=" + Integer.toBinaryString(i)); // 10진수를 2진 정수로 뱐환한 문자열 / i=11111111111111111111111111111110
    }
}
