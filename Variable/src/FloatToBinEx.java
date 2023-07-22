public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f); // float 타입을 int 타입의 값으로 해석해서 변환해주는 매서드

        System.out.printf("%f%n",f); // 9.123457
        System.out.printf("%X%n",i); // 16진수로 출력 / 4111F9AE
    }
}
