package day25;

public class Upcasting {

	public static void main(String[] args) {
		Student st1=new Student("가길동",20,"게임하기",3);
				st1.info();
		//업캐스팅
		Human h1=new Student("나길동",17,"롤하기",3);
		h1.info();//부모클래스로 만들었지만 자식클래스의 info 출력
		st1.study();
		System.out.println(st1.grade);
//		h1.study();//부모클래스 그릇에 맞춰 놓았기 때문에 안됨
//		System.out.println(h1.grade);
	}

}
class Human{
	String name;
	int age;
	String hobby;
//	Human(){}
	public Human(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
}
class Student extends Human{
	int grade;
	public Student(String name,int age,String hobby, int grade) {
		super(name,age,hobby);//호출할 부모클래스 생성자 확실하게 지정
		this.grade=grade;
	}
	void info() {//오버라이딩
		super.info();
		System.out.println("grade:"+grade);
	}
	void study() {
		System.out.println("공부하기");
	}
}
