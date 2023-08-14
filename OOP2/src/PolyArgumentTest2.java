// 조상타입의 참조변수 배열을 사용해 서로 다른 종류의 객체들을 묶어 출력하는 예제
class Audio extends Product {
    Audio(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product 배열에 사용될 카운터

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        item[i++] = product;
        System.out.println(product + "을/를 구입하셨습니다.");
    }
    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; // 구입한 물품의 가격합계
        String itemList = ""; // 구입한 물품목록

        // 반복문을 이용해 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();

        buyer2.buy(new Tv2());
        buyer2.buy(new Computer());
        buyer2.buy(new Audio());
        buyer2.summary();
    }
}
