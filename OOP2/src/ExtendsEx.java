// 클래스로부터 상속받아 클래스를 작성하는 예제
class Tv{
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    void power() { power = !power;}
    void channelUp(){ ++channel;}
    void channelDown(){ --channel;}
}

class CaptionTv extends Tv {
    boolean caption; // 캡션 상태(on/off)

    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }
}
public class ExtendsEx {
    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10; // 조상 클래스로부터 상속받은 멤버
        captionTv.channelUp(); // 조상 클래스로부터 상속받은 멤버
        System.out.println(captionTv.channel);
        captionTv.displayCaption("Hello, world");
        captionTv.caption = true; // 캡션(자막) 기능을 켠다
        captionTv.displayCaption("Hello, World");
    }
}
