package day04;

public class Operator_ch3 {

	public static void main(String[] args) {
//		*단항 연산자 p.43
		int a=1;//a변수에 1값 저장
		System.out.println(a);
		
		a++;//a값 1증가: 후위형
		System.out.println(a); // 이때, a는 2
		System.out.println(++a); // a의 값 1증가, 전위형: 증가가 먼저 a:3
		System.out.println(a++);// a의 값 1증가, 후위형: 증가가 나중에 출력:3
		System.out.println(a);// 12line에서 a의 값이 증가되어 4
		
	}

}
