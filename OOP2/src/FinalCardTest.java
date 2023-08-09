// 생성자를 이용해 final 멤버 변수를 초기화하는 예제
        class Card2 {
            final int NUMBER;
            final String KIND;
            static int width = 100;
            static int height = 250;

            Card2(String kind, int num) {
                // 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화한다.
                KIND = kind;
                NUMBER = num;
            }
            Card2(){
                this("HEART", 1);
    }
    public String toString() {
        return KIND + " " + NUMBER;
    }

}
public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
//        c.NUMBER = 5; // 에러. final 값을 초기화할 수 없음
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); // System.out.println(c.toString())
    }
}
