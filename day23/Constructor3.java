package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b= new Bclass("가길동");
				System.out.println(b.name);
	}

}
class Bclass{
	String name;
	//생성자 오버로딩: 여러개 생성자 중복정의
	Bclass(String name2){//매개변수 생성자
		this.name=name2;
}
}