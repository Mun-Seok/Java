public class FloatEx {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("         123456789012345678901234%n"); //                                 1234567890123245678901234
        System.out.printf("f    :   %f%n",f); // 소수점 이하 6자리까지 출력(7자리에서 반올림)        / f    :   9.123457
        System.out.printf("f    :   %24.20f%n",f);  // 소수점 이하 20자리까지 출력(7자리에서 반올림) / f    :   9.12345695494605500000
        System.out.printf("f2   :   %24.20f%n",f2); // 소수점 이하 20자리까지 출력(7자리에서 반올림) / f2   :   1.23456788063049320000
        System.out.printf("d    :   %24.20f%n",d);  // 소수점 이하 20자리까지 출력(15자리에서 반올림)/ d    :   9.12345678901234600000
    }
}
