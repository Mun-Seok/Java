public class OperatorEx16 {
    public static void main(String[] args) {
        float pi =3.14592f;
        float shortPi = (int)(pi * 1000) / 1000f; // int / int → int (float이나 double 아님/ 결과를 반올림 하는 것이 아니라 버린다.)
        System.out.println(shortPi); // 3.142
    }
}
