package day32;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
		//autoboxing
		Integer i=10;//Integer i=new Integer(10);
		Double d=3.14;
		Float f=3.14f;
		Character c='A';
		
		//autounBoxing
		int ii=i;
		double dd=d;
		float ff=f;
		char cc=c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
	}

}
