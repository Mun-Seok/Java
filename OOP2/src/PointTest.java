// super()를 생성자 첫 줄에 작성해 조상클래스 호출하는 것을 보여주는 예제
public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}
class Point2{
    int x, y;

    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}
class Point3D extends Point2{
    int z;

    Point3D(int x, int y, int z) {
        super(x, y); // 조상클래스의 생성자 Point2(int x, int y)를 호출한다.
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation(){ // 오버라이딩
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
