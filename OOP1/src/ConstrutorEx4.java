// 생성자를 이용해 인스턴스를 복사하는 예제
class Car3{
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4); // Car(String color, String gearType, int door를 호출)
    }
    Car3(Car3 c) { // 인스턴스 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class ConstrutorEx4 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성한다.

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

        c1.door = 100;
        System.out.println("c1.door = 100; 수행 후");
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}
