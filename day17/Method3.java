package day17;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("사각형의 넓이:"+calculator(10,20));//호출될때 a에는 10 b에는 20이라는 값이 저장
	}
	static int calculator(int a,int b) {
		System.out.println("<계산을 시작합니다.>");
		int area=a*b;
		return area;
	}
}
