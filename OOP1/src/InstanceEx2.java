// 인스턴스 생성 후 멤버변수의 값을 변경해보고 출력하는 예제
// TV 클래스는 InstanceEx1에서 생성함
public class InstanceEx2 {
    public static void main(String[] args) {
        TV tv1 = new TV(); // TV tv; tv1=new TV();를 한문장으로 가능
        TV tv2 = new TV();

        System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 " + tv2.channel + "입니다.");

        tv1.channel = 7; // channel의 값을 7으로 한다.
        System.out.println("tv1의 channel 값을 7로 변경하였습니다.");

        System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 " + tv2.channel + "입니다.");
    }
}
