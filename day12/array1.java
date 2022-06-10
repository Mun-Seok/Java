package day12;

public class array1 {

	public static void main(String[] args) {
		
		int scores[]=new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0; i<3;i++) {
			System.out.println(i + 1 + "번째 학생의 점수:"+scores[i]+"점");
		}

	}

}
