package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		Calendar endOfYear=Calendar.getInstance();
		Calendar Christmas=Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11);//month를 이 때로 지정
		endOfYear.set(Calendar.DATE, 31);//datefmf 이 때로 지정
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날:"+diff/(24*60*60*1000));//일수 구하고 싶기 때문에
		
		Christmas.set(2020, 11, 25);
		diff=Christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날:"+diff/(24*60*60*1000));
		}

}
