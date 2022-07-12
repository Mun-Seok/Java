package day30;

public class Exception5 {
	//사용자 정의 예외-예외 정의해서 사용하기
	public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);
		}catch(AgeException e) {
			e.printStackTrace();
		}
	}
	//예외 정의 해주기
	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
}
class AgeException extends Exception{
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}