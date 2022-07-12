package day30;

public class Exception2 {
	//예외던지기	
	public static void main(String[] args) {
		try {
		Exception e=new Exception("고의 예외");
		throw e;//고의로 예외를 던지겠다.
		}
		catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}

}
