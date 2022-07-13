package day31;

public class StringBufferEx {

	public static void main(String[] args) {
		String str="test";
//		StringBuffer buffer="test";//StringBuffer라 사용 X
		StringBuffer buffer=new StringBuffer("test");//변경이 아닌 새로 도입
		
		str.replace('t','T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
	}

}
