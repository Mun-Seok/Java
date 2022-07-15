package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
//		Calendar a=new Calendar(); 추상클래스라 사용불가
		Calendar a=Calendar.getInstance();//싱글턴 패턴
		Calendar b=new GregorianCalendar();
		System.out.println(a.toString());
		System.out.println(b.toString());
		//Month->1월이 0
		
	}

}
