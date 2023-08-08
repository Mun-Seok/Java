// Point3D2 클래스의 인스턴스를 생성할 때 어떤 순서로 인스턴스의 초기화가 진행되는지 보여주는 예제
public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point3{
    int x = 10;
    int y = 20;

    Point3(int x, int y) {
        // 생성자 첫 줄에 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super();'를 여기에 삽입한다.
        this.x = x;
        this.y = y;
    }
}
class Point3D2 extends Point3{
    int z = 30;

    Point3D2(){
        this(100, 200, 300); // Point3D2(int x, int y, int z)를 호출한다.
    }
    Point3D2(int x, int y, int z) {
        super(x, y); // Point3D2(int x, int y, int z)를 호출한다.
        this.z = z;
    }
}
