// 하나의 메서드로 여러 인스턴스를 매개변수로 제공하는 예제
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가격의 10%
    }
}

class Tv2 extends Product {
    Tv2() {
        //조상클래스의 생성자 Product(int Price)를 호출한다.
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    // Object 클래스의 toString()을 오버라이딩한다.
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product{
    Computer() {
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += product.bonusPoint; // 제품의 보너스 포인트를 추가한다.
        System.out.println(product + "을/를 구입하셨습니다.");
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}

