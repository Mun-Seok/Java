// TV 클래스로부터 인스턴스 생성 후 속성과 기능을 사용하는 예제
class TV{
    // TV의 속성(멤버변수)
    String color; // 색상
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    // TV의 기능(메서드)
    void power() { // TV를 켜거나 끄는 기능을 하는 메서드
        power = !power;
    }

    void channelUp(){ // TV의 채널을 높이는 기능을 하는 메서드
        ++channel;
    }
    void channelDown(){ // TV의 채널을 낮추는 기능을 하는 메서드
        --channel;
    }
}
public class InstanceEx1 {
    public static void main(String[] args) {
        TV tv;              // TV 인스턴스를 참조하기 위한 변수 tv를 선언
        tv = new TV();      // TV 인스턴스를 생성한다.
        tv.channel = 7;     // TV 인스턴스의 멤버변수 channel의 값을 7로 한다.
        tv.channelDown();   // TV 인스턴스의 메서드 channelDown()을 호출한다.
        System.out.println("현재 채널은 " + tv.channel + "입니다.");
    }

}
