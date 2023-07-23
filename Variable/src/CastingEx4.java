public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567; // 8자리의 10진수
        float f = (float) i; // int 타입을 float 타입으로 형변환
        int i2 = (int) f; // float 타입을 int 타입으로 형변환

        double d = (double) i; // int 타입을 double 타입으로 형변환
        int i3 = (int) d; // double 타입을 int 타입으로 형변환

        float f2 = 1.666f;
        int i4 = (int) f2; // float 타입을 int 타입으로 형변환

        System.out.printf("i = %d\n", i); // i = 91234567
        System.out.printf("f = %f i2 = %d\n", f, i2); // f = 91234568.000000 i2 = 91234568
        System.out.printf("d = %f 13 = %d\n", d, i3); // d = 91234567.000000 i3 = 91234567
        System.out.printf("(int) %f = %d\n", f2, i4); // (int) 1.666000 = 1
    }
}
