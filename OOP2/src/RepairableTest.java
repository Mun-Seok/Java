// 인터페이스를 사용해 클래스들에게 관계를 맺어주는 예제
public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}
interface Repairable {}
class Unit2 {
    int hitPoint;
    final int MAX_HP;
    Unit2(int hp){
        MAX_HP = hp;
    }
    // ...
}
class GroundUnit extends Unit2{
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit2 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
    // ...
}
class Dropship extends AirUnit implements Repairable {
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
    // ...
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
    // ...
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable repairable) {
        if (repairable instanceof Unit2) {
            Unit2 unit = (Unit2) repairable;
            while (unit.hitPoint != unit.MAX_HP) {
                /* Unit의 HP를 증가시킨다. */
                unit.hitPoint++;
            }
            System.out.println(unit.toString() + "의 수리가 끝났습니다.");
        }
    }
}