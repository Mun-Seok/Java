package practice;

import java.util.Scanner;

public class Homework_day04_2 {

	public static void main(String[] args) {
//		switch문 문제
//		형변환기
//		숫자를 입력해주십시오
//		어떤형으로 변환시키겠습니까? 1: float 2:int 3:double
//		입력값은 어떤형으로 변환 완료하였습니다.
//		1.변수정의
		int number;
		int form;
		float a;
		int b;
		double c;
//		2.메서드 정의
		Scanner sc=new Scanner(System.in);
//		3.흐름도 구성
		System.out.println("숫자를 입력해주세요");
		number=sc.nextInt();
		System.out.println("어떤형으로 변환시키겠습니까? 1: float 2:int 3:double");
		form=sc.nextInt();
		switch(form){
		  case 1:
			  a =(float)number;
			  System.out.println(a);
		  break;
		  case 2:
			  b= (int)number;
			  System.out.println(b);
			  break;
		  case 3:
			  c=(double)number;
			  System.out.println(c);
			  break;
		  default:
			System.out.println("형을 잘못입력하셨습니다.");
		}

	}

}
