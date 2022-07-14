package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer ii=30;//autoboxing
		//Integer->int
		System.out.println(ii.intValue()+3);
		//Integer->double
		System.out.println(ii.doubleValue());
		//Integer->float
		System.out.println(ii.floatValue());
		//Integer->String 확인법-문자의 덧셈의 문자의 연결
		System.out.println(ii.toString()+3);
	}

}
