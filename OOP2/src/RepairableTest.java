public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        Scv scv = new Scv();

        scv.repair(tank);
        scv.repair(dropship);
        scv.repair(marine);
    }
}
interface Repairable {}
class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit(int hp){
        MAX_HP = hp;
    }
    // ...
}
class GroundUnit extends Unit{
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit(int hp) {
    super(hp);
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}