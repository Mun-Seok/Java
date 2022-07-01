package day22;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user[]=new User[4];
		for (int i=0;i<4;i++) {
			user[i]=new User();
		}
		for(int i=0;i<4;i++) {
			System.out.print("name:");
			user[i].name=sc.next();
			System.out.print("phone:");
			user[i].phone=sc.next();
			System.out.print("age:");
			user[i].age=sc.nextInt();
			System.out.print("gender:");
			user[i].gender=sc.next();
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			user[i].info();
		}
		
	}

}
class User{
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("name:"+name);
		System.out.println("phone:"+phone);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
	}
}