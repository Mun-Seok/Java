package day32;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random random=new Random();//seed::현재시간
		Random random2=new Random(2);//seed:2
		Random random3=new Random(2);//seed:2
		
		for(int i=0;i<5;i++) {
			System.out.println("random:"+random.nextInt());
		}
		//seed 값 달라지므로 다름
		for(int i=0;i<5;i++) {
			System.out.println("random1:"+i+"번째의 값:"+random.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("random1:"+i+"번째의 값:"+random.nextInt());
		}
		//seed값이 같아 같음
		for(int i=0;i<5;i++) {
			System.out.println("random2:"+i+"번째의 값:"+random2.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("random3:"+i+"번째의 값"+random3.nextInt());
		}
		
	}

}
