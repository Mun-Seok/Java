package day15;

import java.util.Scanner;

public class fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fruits[]= new String[3];
		for(int i=0;i<3;i++) {
			fruits[i]=sc.next();
		}
		
		for (String i:fruits) {
			System.out.println(i);
		}
	}

}
