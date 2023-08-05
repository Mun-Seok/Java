// 인스턴스를 생성하고 주로를 같게하고 출력하는 예제
// TV 클래스는 InstanceEx1에 있음
public class InstanceEx3 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        System.out.println("tv1의 channel 값은 "+ tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 "+ tv2.channel + "입니다.");

        tv2 = tv1;
        tv1.channel = 7;
        System.out.println("tv1의 channel 값을 7로 변경하였습니다.");

        System.out.println("tv1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("tv2의 channel 값은 " + tv2.channel + "입니다.");
    }
}
