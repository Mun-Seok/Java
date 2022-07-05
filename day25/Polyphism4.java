package day25;

public class Polyphism4 {

	public static void main(String[] args) {
		Animal lion1=new Lion();//animal타입으로 만드는게 좋음
//		Lion l=new Lion();
//		int i=2;
		Animal rabbit1=new Rabbit();
		Animal monkey1=new Monkey();
		Zookeeper james=new Zookeeper();
		james.feed(lion1);
//		james.feed(l);
//		james.feed(i);
		james.feed(rabbit1);
		james.feed(monkey1);
	}

}
class Animal{
	void breath(){System.out.println("숨쉬기");}
}
class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}
class Zookeeper{
	void feed(Animal animal) {
		System.out.println(animal+"에게 먹이주기");
	}
}