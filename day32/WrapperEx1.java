package day32;

public class WrapperEx1 {

	public static void main(String[] args) {
		//기본 자료형을 Wrapper 클래스로 객체로 사용
		int i=30;
		Integer ii=new Integer(i);
		System.out.println(ii);
		
		double d=3.14;
		Double dd=new Double(d);
		System.out.println(dd);
	}

}
