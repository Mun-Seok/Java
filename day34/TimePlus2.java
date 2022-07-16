package day34;

import java.time.LocalDateTime;

public class TimePlus2 {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("현재시간:"+ldt);
		LocalDateTime ldt2=ldt.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간:"+ldt2);
		
		LocalDateTime ldt3=ldt2.minusHours(24);
		System.out.println("자동변환시간:"+ldt3);
		
	}

}
