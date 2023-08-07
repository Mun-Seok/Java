// 클래스/인스턴스 초기화 블럭 사용하는 예제
public class InitializationBlockEx1 {
    // 클래스 초기화 블럭
    static{
        System.out.println("static {  }");
    }
    // 인스턴스 초기화 블럭
    {
        System.out.println("{  }");
    }
    public InitializationBlockEx1(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("IntializationalBlockEx1 ib = new IntializationalBlockEx1();");
        InitializationBlockEx1 ib = new InitializationBlockEx1();

        System.out.println("InitializationBlockEx1 ib2 = new InitializationBlockEx1();");
        InitializationBlockEx1 ib2 = new InitializationBlockEx1();
    }
}
