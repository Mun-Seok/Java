package practice;

import java.util.Scanner;

public class Homework_day04 {

	public static void main(String[] args) {
//      #if문 문제
//		더하기 뺄셈 곱하기 계산기
//		연산을 선택하십시오. 1:더하기 2:뺄셈 3:곱셈
//		변수 1 입력 부탁드립니다.
//		변수 2 입력 부탁드립니다.
//		변수 1 연산 변수2 의 결과는 $$입니다
		
//		1.변수정의
		int cal;
		int a;
		int b;
//		2.메서드 정의
		Scanner sc=new Scanner(System.in);
//		3.흐름도 구성
		System.out.println("연산을 선택하십시오. 1:더하기 2:뺄셈 3:곱셈");
		cal=sc.nextInt();
		if(cal==1) {
			System.out.println("변수 1 입력 부탁드립니다.");
			a=sc.nextInt();
			System.out.println("변수 2 입력 부탁드립니다.");
			b=sc.nextInt();	
			System.out.println(a+b);
		}
		else if(cal==2) {
			System.out.println("변수 1 입력 부탁드립니다.");
			a=sc.nextInt();
			System.out.println("변수 2 입력 부탁드립니다.");
			b=sc.nextInt();	
			System.out.println(a-b);
		}
		else if(cal==3) {
			System.out.println("변수 1 입력 부탁드립니다.");
			a=sc.nextInt();
			System.out.println("변수 2 입력 부탁드립니다.");
			b=sc.nextInt();	
			System.out.println(a*b);
		}
		else {
			System.out.println("연산을 잘못선택하셨습니다.");
		}
	}

}
