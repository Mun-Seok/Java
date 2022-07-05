package day25;

public class Downcasting1 {

	public static void main(String[] args) {
		//업캐스팅
		Human h1=new Student("가길동",20,"게임하기",3);
		//다운캐스팅
		Student s1=(Student)h1;
		s1.study();//다운 캐스팅해 자식클래스의 것 호출할 수 잇음
	}

}
