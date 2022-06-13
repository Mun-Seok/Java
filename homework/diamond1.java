package diamond;

import java.util.Scanner;

public class diamond1 {

	public static void main(String[] args) {
//		  1.변수설정
        int dia_count,dia_size,space,star;
//        	갯수		크기			공간  별
//        2.매서드 정의
        Scanner sc =new Scanner(System.in);
//        3.구성
        System.out.print("how many diamond do you want to make?");
		dia_count=sc.nextInt();
		System.out.print("what size diamond do you want to make?");
			dia_size=sc.nextInt();
			
			for (int i=0; i<dia_count;i++) {//전체 다이아 반복
				for (int j=0;j<dia_size;j++) {//위에 다이아 반(=세모)만들기
					space=dia_size-j-1;//*전의 빈 공간
					star=j*2+1;//*의 갯수 1개 3개 5개...
					for (int k=0;k<space;k++) {
						System.out.print(" ");
					}
					for (int k=0;k<star;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int j=dia_size-1;j>0;j--) {//밑에 역세모 모양 만들기
					space=dia_size-j;//*전의 빈 공간
					star=(j-1)*2+1;//*의 갯수 ...5개 3개 1개
					for (int k=space;k>0;k--) {
						System.out.print(" ");
					}
					for (int k=star;k>0;k--) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
			}
	}

}
