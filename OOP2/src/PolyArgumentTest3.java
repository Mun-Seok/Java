import java.util.*;
class Product2 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매시 제공하는 보너스점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가격의 10%
    }
    Product2(){
        price = 0;
        bonusPoint = 0;
    }
}
class Tv3 extends Product2{
    Tv3() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(100);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

class Buyer3{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체

    void buy(Product2 product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        item.add(product);
        System.out.println(product + "을/를 구입하셨습니다.");
    }
    void refund(Product2 product) { // 구매한 제품을 환불한다.
        if (item.remove(product)) {
            money += product.price;
            bonusPoint -= product.bonusPoint;
            System.out.println(product + "을/를 반품하셨습니다.");
        } else { // 제거에 실패한 경우
            System.out.println("구매하신 제품 중 해당 제품이 없습니다.");
        }
    }
    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; // 구입한 물품의 가격합계
        String itemList = ""; // 구입한 물품목록

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        // 반복문을 이용해 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size(); i++) {
            Product2 product = (Product2) item.get(i);
            sum += product.price;
            itemList += (i==0) ? "" + product : ", " + product;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 buyer = new Buyer3();
        Tv3 tv = new Tv3();
        Computer2 computer = new Computer2();
        Audio2 audio = new Audio2();

        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.summary();
        System.out.println();
        buyer.refund(computer);
        buyer.summary();
    }
}
