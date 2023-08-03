public class ArrayEx12 {
    public static void main(String[] args) {
        // String 배열을 초기화하고 출력하는 예제
        String[] name = new String[3]; // 길이가 3인 String 배열을 생성
        name[0] = "Kim";
        name[1] = "Park";
        name[2] = "Yi";

        // 괄호{}를 사용해서 간단히 초기화
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] : " + names[i]);
        }

        String temp = names[2]; // 배열 names의 세번째 요소를 temp에 저장
        System.out.println("temp : " + temp);
        names[0] = "Yu"; // 배열 names의 첫번째 요소를 "Yu"로 변경

        for (String str : names) { // 향상된 for문
            System.out.println(str);
        }
    }
}
