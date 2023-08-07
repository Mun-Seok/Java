// 클래스 멤버와 인스턴스 멤버간의 참조 또는 호출을 하는 예제
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; // 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음
    static int cv2 = new MemberCall().iv; // 객체를 생성해야 사용가능

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // 에러. 클래스 메서드에서 인스턴스 변수를 사용 불가
        MemberCall memberCall = new MemberCall();
        System.out.println(memberCall.iv); // 객체를 생성하면 인스턴스 변수의 참조가능
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수를 바로 사용가능
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); // 에러. 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없음
        MemberCall memberCall = new MemberCall();
        memberCall.instanceMethod1(); // 인스턴스를 생성한 후에야 호출할 수 있음
    }

    void instanceMethod2(){ // 인스턴스 메서드에서는 인스턴스메서드와 클래스메서드 모두 인스턴스 생성 없이 바로 호출이 가능하다.
        staticMethod2();
        instanceMethod1();
    }
}
