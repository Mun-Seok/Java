// Up-casting과 Down-casting을 해서 인스턴스를 출력하는 예제
public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fireEngine = new FireEngine();
        FireEngine fireEngine2 = null;

        fireEngine.water();
        car = fireEngine; // car = (Car)fireEngine;에서 형변환이 생략된 형태이다.
//        car.water(); // 컴파일 에러!! Car 타입의 참조변수로 water()를 호출할 수 없다.
        fireEngine2 = (FireEngine) car; // 자손타입 ← 조상타입
        fireEngine2.water();
    }
}
class Car {
    String color;
    int door;
    void drive() { // 운전하는 기능
        System.out.println("drive, Brrr~");
    }
    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water(){ // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}
