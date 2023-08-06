// 클래스 변수와 인스턴스 변수 생성 후 값을 변경하고 출력해보는 예제
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
public class VariableEx {
    public static void main(String[] args) {
        System.out.println("Card.width = " +Card.width); // 클래스 변수 (static 변수)는 객체 생성 없이 '클래스 이름.클래스 변수'로 직접 사용 가능
        System.out.println("Card.height = " +Card.height);

        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 7;

        // 인스턴스 변수의 값을 변경
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        // 클래스 변수의 값을 변경
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}
