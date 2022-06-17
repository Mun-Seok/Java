package day18;

public class SumEx {

	public static void main(String[] args) {
		sum_int(10,20);
		sum_double(1.23,3.12);
	}
	//매서드의 매개변수 타입에 변화
	static void sum_int(int x,int y) {
		System.out.println(x+y);
		}
	static void sum_double(double x,double y) {
			System.out.println(x+y);
	}
	//메서드의 매개변수의 갯수의 변화
	static void sum(int x,int y, int z) {
		System.out.println(x+y+z);
	}
}
