// 문자열에 구분자를 사이에 포함시켜 결합해 반환하는 메서드를 정의해 출력하는 예제
public class OverloadingEx2 {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") + "]");
    }

    static String concatenate(String delim, String... args) { // 가변인자로 매개변수를 선언해 개수의 제약없음
        String result = "";

        for (String str : args) {
            result += str + delim;
        }
        return result;
    }

    /*
    static String concatenate(String ...args){ // 두 오버로딩된 메서드가 구분되지 않아 에러가 발생
        return concatenate("",args);
    }
    */
}
