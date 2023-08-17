// 인터페이스를 사용해 간접적인 관계에 있는 클래스들을 보여주는 예제
class A2{
    void autoPlay(I i) {
        i.play();
    }
}
interface I {
    public abstract void play();
}
class B2 implements I {
    public void play(){
        System.out.println("play in B class");
    }
}

class C2 implements I {
    public void play() {
        System.out.println("play in C class");
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2()); // void autoPlay(I i) 호출
        a.autoPlay(new C2()); // void autoPlay(I i) 호출
    }
}