public class OperatorEx31 {
    public static void main(String[] args) {
        int hex = 0xABCD;
        int mask = 0xF;

        // 16진수를 한자리씩 뽑아내는 예제
        System.out.printf("hex = %X%n", hex); // hex = ABCD
        System.out.printf("%X%n", hex & mask); // D

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask); // C

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask); // B

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask); // A
    }
}
