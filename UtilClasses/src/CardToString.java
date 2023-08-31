// toString을 오버라이딩 하지 않고 출력해보는 예제
class Card{
    String kind;
    int number;
    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
