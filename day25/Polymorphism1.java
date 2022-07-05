package day25;

public class Polymorphism1 {

	public static void main(String[] args) {
		
		A obj=new B();//부모변수=자식값 : 업캐스팅
		obj.methodA();
//		obj.methodB(); 정의되있지 않다는 에러발생
		
	}

}
class A{
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}