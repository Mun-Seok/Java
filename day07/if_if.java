package day07;

import java.util.Scanner;

public class if_if {

	public static void main(String[] args) {
		String id, password;
		Scanner input=new Scanner(System.in);
		System.out.print("아이디를 입력해주세요:");
		id=input.nextLine();//띄어쓰기 까지 입력받기ㅣ
		
		if(id.equals("java")) {
			System.out.println("id일치!");
			System.out.print("비밀번호를 입력해주세요:");
			password=input.nextLine();
			if(password.equals("abc123")){
				System.out.println("password 일치");
				System.out.println("로그인 성공!");
			
			}
			else {System.out.println("password 불일치");
		}

	}
		else {
			System.out.println("ID 불일치");
	}
		
	}
}
