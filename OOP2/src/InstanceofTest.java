// instanceof 연산자를 사용해 형변환이 가능한지 확인하는 예제
public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();

        if (fireEngine instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }

        if (fireEngine instanceof Car) {
            System.out.println("This is a Car instance.");
        }

        if (fireEngine instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fireEngine.getClass().getName()); // 클래스의 이름을 출력
    }
}
