package day13;

import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
//		1.변수정의
		int lottoAr[]=new int[6];
		int userAr[]=new int[6];
		int bonus,bonusUser;
		int count=0;
		
//		2.메서드정의
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
//		3.구성
//		로또번호 6개 입력받음
		for(int i=0;i<6;i++) {
		lottoAr[i]=random.nextInt(45)+1;
		System.out.println(lottoAr[i]);
		}
		bonus=random.nextInt(45)+1;
		
//		사용자에게 번호 6개 받음
		for (int i=0;i<6;i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.print("보너스 값 입력:");
		bonusUser=sc.nextInt();
//		로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅
		for (int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if (lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		if(count==6) {
			System.out.println("축하드립니다.1등입니다!");
		}else if(count==5) {
			if(bonus==bonusUser) {
			System.out.println("축하드립니다.2등입니다!");
			}else {
				System.out.println("축하드립니다.3등입니다!");
			}
		}else if(count==4) {
			System.out.println("축하드립니다.4등입니다!");
		}else if(count==3) {
			System.out.println("축하드립니다.5등입니다!");
		}else {
			System.out.println("아쉽지만 다음 기회에");
		}
	}

}
