public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ; // 절댓값
        char signX, signY, signZ; // 부호

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x; // x의 값이 음수면 양수로 만든다.
        absY = y >= 0 ? y : -y; // y의 값이 음수면 양수로 만든다.
        absZ = z >= 0 ? z : -z; // z의 값이 음수면 양수로 만든다.

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-'); // x의 값이 양수면 +, 0이면 부호 X, 음수면 -를 붙여준다.
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-'); // y의 값이 양수면 +, 0이면 부호 X, 음수면 -를 붙여준다.
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-'); // z의 값이 양수면 +, 0이면 부호 X, 음수면 -를 붙여준다.

        System.out.printf("x = %c%d%n", signX, absX); // x = +10
        System.out.printf("y = %c%d%n", signY, absY); // y = -5
        System.out.printf("z = %c%d%n", signZ, absZ); // z =  0
    }
}
