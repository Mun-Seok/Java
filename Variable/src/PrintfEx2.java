public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.naver.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g %n", f1, f1, f1); // f1 = 0.10000, 1.000000e-01, 0.100000
        System.out.printf("f2 = %f, %e, %g %n", f2, f2, f2); // f2 = 10.000000, 1.000000e+01, 10.0000
        System.out.printf("f3 = %f, %e, %g %n", f3, f3, f3); // f3 = 3140.000000, 3.140000e+03, 3140.00

        System.out.printf("d = %f %n", d); // d = 1.234568 (마지막 자리 반올림됨)
        System.out.printf("d = %14.10f %n", d); // d =   1.2345678900

        System.out.printf("[12345678901234567890] %n"); // [123345678901234567890]
        System.out.printf("[%s] %n", url); // [www.naver.com]
        System.out.printf("[%20s] %n", url); // 20자리 출력     [       www.naver.com]
        System.out.printf("[%-20s] %n", url); // 왼쪽 정렬      [www.naver.com       ]
        System.out.printf("[%.9s] %n", url); // 왼쪽에서 8글자만 출력    [www.naver]
    }
}
