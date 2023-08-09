// 생성자의 접근 제어자를 private으로 지정하고 메서드로 인스턴스를 생성하는 예제
final class Singleton{
    private static Singleton s = new Singleton();
    private Singleton(){
        // ...
    }
    public static Singleton getInstance(){
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}
public class SigletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}
