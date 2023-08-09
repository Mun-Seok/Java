// 조상 타입의 인스턴스를 자손타입의 참조변수로 참조하는 예제
public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fireEngine = null;

        car.drive();
        fireEngine = (FireEngine) car; // 실행시 에러 발생
        fireEngine.drive();
        car2 = fireEngine;
        car2.drive();
    }
}
