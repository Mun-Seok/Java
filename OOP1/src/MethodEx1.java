// 사칙연산을 4개의 메서드로 해서 출력하는 예제
class MyMath{
    long add(long a, long b) {
        /*long result = a + b;
        return result;*/
        return a + b; // 2줄을 1 줄로 적을 수 있다.
    }

    long subtract(long a, long b){
        return a - b;
    }

    long multiple(long a, long b) {
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }
}
public class MethodEx1 {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.subtract(5L, 3L);
        long result3 = myMath.multiple(5L, 3L);
        double result4 = myMath.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiple(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}
