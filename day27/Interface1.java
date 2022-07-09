package day27;

public class Interface1 {

	public static void main(String[] args) {
		Ainter a;// =a new inter 객체 생성할수 x
//		a.x=30;상수라 값을 못바꿈
		B b=new B();
		b.methodA();
		b.methodB();
//		b.x=30; 상수라 변경불가
	}

}

interface Ainter{
	final int x=10;
	int y=20;//final 생략가능
	abstract void methodA();
	void methodB();//abstract 생략가능
}
class B implements Ainter{

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	
}