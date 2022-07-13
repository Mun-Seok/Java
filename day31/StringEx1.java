package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat,substing,length,toUpper,toLower
		//concat 문자열 연결
		str.concat(" world!");// str 문자 자체가 변하는건 x 
		System.out.println(str.concat(" world!"));
		//substring(시작위치,끝위치) :시작 위치~ 끝위치 전까지 가져옴
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(3));//시작부터 끝까지 가져옴
		//length():문자열 길이 반환
		System.out.println(str.length());
		//toUpperCase,toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		
		//charAt(인덱스),indexOf(문자열),equals(문자열)
		System.out.println(str.charAt(1));//인덱스에 해당하는 문자 반환
		System.out.println(str.indexOf("o"));
		System.out.println("hello world".indexOf("WORLD"));//못찾으면 -1 반환
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("HELLO"));
		//trim(),replace,replaceAll
		System.out.println("test".trim());//공백 제거
		System.out.println("hello world".replace('l', 'L'));//문자 교체
		System.out.println("hello world".replaceAll("hello","bye"));//문자열 교체
	}

}
